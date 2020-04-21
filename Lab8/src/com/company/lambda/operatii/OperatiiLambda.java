package com.company.lambda.operatii;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.company.lambda.Employee;

public class OperatiiLambda {

	public static void main(String[] args) {
		// folosind un array
		Employee[] arrayOfEmps = {
				new Employee(1, "Jeff Bezos", 100000.0),
				new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0)
		};
		Stream.of(arrayOfEmps);

		// folosind o colectie (in Java 8 au adaugat o o noua metoda stream() in interfata Collection)

		List<Employee> empList = Arrays.asList(arrayOfEmps);
		empList.stream();

		Stream.of("a", "b", "c");
		Stream.of(1, 2, 3);

		 // Operatii pe stream-uri (intermediare si finale)

		/*
		forEach()
		 - este cea mai simpla si comuna operatie, parcurge elementele stream-ului
		 apeland functia data ca parametru pe fiecare element
		 - exista in Iterable si Map
		 - este o operatie terminala, dupa ce este apelata, nu mai putem sa facem operatii
		 pe stream-ul respectiv este considerat ca fiind consumat
		*/
		empList.stream().forEach( e -> System.out.println(e.getName()));


		/*
		map()
		 - creaza un stream nou dupa aplicarea unei functii la fiecare element al stream-ului original
		 - stream-ul nou poate sa fie de tip diferit
		 - operatie intermediara
		 */
		List<Integer> ids = empList.stream()
				.map(e -> e.getId())
				.collect(Collectors.toList());
		System.out.println(ids);

		/*
			collect()
			 - cea mai comuna metoda de a prelua elemente dintr-un stream dupa prelucrare lor, si a le
			   impacheta intr-o structura
			 - operatie terminala
		 */
		List<Employee> employees = empList.stream().collect(Collectors.toList());
		Set<Employee> employeesSet = empList.stream().collect(Collectors.toSet());
		Map<Integer, String> employeesMap = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));

		System.out.println(employeesSet);
		System.out.println(employeesMap);

		/*
			filter()
			- creaza un stream nou pe baza elementelor din stream-ul vechi care respecta conditia din filter
			- operatie intermediara
		 */

		List<Employee> filteredEmployees = employees.stream()
				.filter(e -> e.getSalary() > 150000.0)
				.collect(Collectors.toList());
		filteredEmployees.stream().forEach(e -> System.out.println("Name: " + e.getName() + "  salary: " + e.getSalary()));

		/*
			findFirst()
			- intoarce un obiect de tip Optional pentru prima intrare din stream
			- operatie terminala
		 */
		Employee employee = employees.stream()
				.filter(e -> e.getSalary() > 150000.0)
				.findFirst()
				.orElse(null);
		System.out.println(employee.getName() + " " + employee.getSalary());

		/*
			flatMap()
			- un stream poate sa contina structuri de date complexe
				Stream<List<String>>	-> flatMap ->	Stream<String>

				{ {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}

				{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
		 */

		List<List<String>> namesNested = Arrays.asList(
				Arrays.asList("Jeff", "Bezos"),
				Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));

		List<String> namesFlatStream = namesNested.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());

		System.out.println(namesFlatStream);


		// Operatiile pe stream-uri sunt clasificate in operatii intermediare si operatii terminale
		// operatiile intermediare ca filter() intorc un stream nou pe care se pot face procesari
		// operatiile terminale ca forEach(), marcheaza stream-ul ca fiind consumat, punct in care nu mai poate fi folosit


		// unele operatii sunt considerate operatii de scurt circuitare
		// operatiile de scurt-circuitare permit operatii pe stream-uri de date infinite in timp finit
		Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

		List<Integer> collect = infiniteStream
				.skip(3)
				.limit(5)
				.collect(Collectors.toList());
		System.out.println(collect);

	}
}
