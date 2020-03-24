package com.company.lab5.interfaces.ex5;

	/*
		O interfata cu o singura metoda abstracta se numeste interfata functionala.

		Adnotarea @FunctionalInterface a fost introdusa pentru a marca o interfata functionala.

		Adaugarea aceste adnotari previne eventualele adaugari accidentale de metode multiple intr-o interfata
		care se doreste a fi de tip functional dar in esenta orice interfata cu o singura metoda este interfata functionala
		si adnotarea @FunctionalInterface nu este obligatorie.

		Interfetele functionale sunt folosite pentru expresii lambda.
 	*/
@FunctionalInterface
public interface Shape {

//	protected String test;

	void draw();


	//void draw1();


		default void write(){

	}

	static void print(){

	};
}
