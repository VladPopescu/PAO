package com.company.lambda;

import java.util.Comparator;

public class LambdaExamples {

	public static void main(String[] args) {


		Comparator<String> stringComparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		int comparison = stringComparator.compare("hello", "world");
		//		System.out.println((int) 'h');
		//		System.out.println((int) 'w');
		System.out.println(comparison);

		Comparator<String> stringComparatorLambda = (String o1, String o2) -> {
			return o1.compareTo(o2);
		};

		System.out.println(stringComparatorLambda.compare("hello", "world"));


		/*
			O expresie lambda este o bucata de cod care implementeaza o interfata functionala fara crearea unei clase anonime sau concrete.

			Practic o expresie lambda este o metoda anonima.
		 */

		// Advantages of lambda expressions
		/*
			- fewer lines of code
			- are useful when parsing collections, more efficient
		 */

	}
}
