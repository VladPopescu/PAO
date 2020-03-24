package com.company.lab2;

public class Student extends Persoana{

	public Student(int varsta) {
		super();
		super.afiseazaVarta();
	}

	public static void main(String [] args){

		Persoana p1 = new Student(20);
		System.out.println(p1 instanceof Student);
		System.out.println(p1 instanceof Persoana);
		System.out.println(p1 instanceof Eleve);

	}


}
