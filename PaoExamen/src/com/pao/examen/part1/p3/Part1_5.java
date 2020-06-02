package com.pao.examen.part1.p3;

class A {
	String sir = "";
	public A(String sir) { this.sir = this.sir + sir + "A"; }
}
class B extends A {
	public B(String sir) { super(sir); this.sir = this.sir + sir + "B"; }
}
class C extends B {
	public C(String sir) { super(sir); this.sir = this.sir + sir + "C"; }
}



public class Part1_5 {
	public static void main(String[] args) {
		System.out.println(new C("D").sir);
		// c) DADBDC
	}

}
