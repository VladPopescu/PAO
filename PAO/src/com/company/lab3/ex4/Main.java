package com.company.lab3.ex4;

public class Main {

	public static void main(String[] args) {
		Persoana vp = new Persoana("Virgil Popescu", 45, 1.68);
		Student db = new Student("Doria Banciu", 35, 1.67, 7.80, "ETTI");
		vp.sePrezinta();
		db.sePrezinta("Buna ziua");
	}
}
