package com.pao.examen.part1.p2;


class A {
	public static int f(int x) {
		System.out.println("Metoda A");
		return x+1; }
	public int g(int x) {
		System.out.println("Metoda A");
		return x+2; }
}
class B extends A {
	public static int f(int x) {
		System.out.println("Metoda B");
		return x+4; }
	public int g(int x) {
		System.out.println("Metoda B");
		return x+3; }
}

public class Part1_4 {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.f(1));
		System.out.println(a.g(3));
		System.out.println(a.f(1) + a.g(3));
		// c) 8
		// static methods are not overriden
		// overriding concept is used for instances, and static fields are not dependant on instance
	}
}
