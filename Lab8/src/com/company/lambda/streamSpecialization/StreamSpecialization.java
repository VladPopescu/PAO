package com.company.lambda.streamSpecialization;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.company.lambda.Employee;

public class StreamSpecialization {

	/*
		- Stream este un stream de referinte de obiecte
		- Exista si IntStream, LongStream, DoubleStream , specializate pentru primitive
		- Utile cand sunt de prelucrat multe primitive numerice
		- Nu extind Stream, ci BaseStream (pe baza caruia si Strean este construit)
		  Ca o consecinta, nu toate operatiile suportate de Stream, sunt prezente in aceste implementari de Stream
		  Dar ele ofera si operatii aditionale sum(), average()
	 */
	public static void main(String[] args) {
		// folosind un array
		Employee[] arrayOfEmps = {
				new Employee(1, "Jeff Bezos", 100000.0),
				new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0)
		};
		Stream.of(arrayOfEmps);
		List<Employee> empList = Arrays.asList(arrayOfEmps);

		Integer latestEmpId = empList.stream()
				.mapToInt(Employee::getId)
				.max()
				.orElseThrow(NoSuchElementException::new);


		IntStream.of(1, 2, 3); // IntStream
		Stream.of(1, 2, 3); // Stream<Integer>

		System.out.println(latestEmpId);

		Double avgSal = empList.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElseThrow(NoSuchElementException::new);

		System.out.println("Average salary: " + avgSal);

		Double sum = empList.stream()
				.mapToDouble(Employee::getSalary)
				.sum();
		System.out.println("Sum salary: " + sum);

	}
}
