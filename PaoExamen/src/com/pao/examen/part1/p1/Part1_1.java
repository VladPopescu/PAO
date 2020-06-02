package com.pao.examen.part1.p1;

class C {
	public static int a = 1;
}

public class Part1_1 {

	public static void main(String[] args) {
		C ob1 = new C();
		C ob2 = new C();
		ob1.a++;
		System.out.println(++ob2.a);

		// Raspuns: b) 3
	}
}
