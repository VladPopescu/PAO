package com.company.lambda.operatii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("4");
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("6");
		list.add("1");
		list.add("7");

		//		Iterator<String> iterator = list.iterator();
		//		while (iterator.hasNext()) {
		//			String s = iterator.next();
		//			if (s == "1") {
		//				iterator.remove();
		//				System.out.println("Removed \"1\"");
		//			}
		//		}

		// Stream pipeline
		// sursa (array, o colectie, un canal de intrare/iesire)
		// zero sau mai multe operatii intermediare (care transforma un stream intr-un alt stream)
		// o operatie terminala, care produce un rezultat, sau un efect secundar, cum ar fi count() sau forEach()

		// intoarce o secventa de elemente ce suporta operatii secventiale si paralele , agregate
		List<String> listaFiltrata = list.stream()
				.filter(s -> s != "1")
				.filter(s -> s != "2")
				.collect(Collectors.toList());
		//.count();

        // cea mai simpla si comuna operatie , itereaza prin fiecare element apeland functia data ca parametru
		list.stream().forEach(s -> System.out.println(s));

		System.out.println(listaFiltrata);
	}
}
