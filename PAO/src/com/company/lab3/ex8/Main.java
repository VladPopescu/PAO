package com.company.lab3.ex8;

public class Main {

	public static void main(String[] args) {
		Produs p1 = new Produs(1, "varza");
		Produs p2 = new Produs(2, "salata");

		System.out.println(p1.equals(p2));

		Produs p3 = new Produs(2, "cartofi");
		Produs p4 = new Produs(2, "cartofi");

		System.out.println(p3.equals(p4));

		String s1 = "sir";
		String s2 = "sir";
		System.out.println(s1.equals(s2));

		String s3 = new String();
		s3 = "a";
		String s4 = new String();
		s4 = "b";
		System.out.println(s3.equals(s4));

	}
}
