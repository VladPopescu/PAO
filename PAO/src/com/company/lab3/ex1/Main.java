package com.company.lab3.ex1;

public class Main {

	public static void main(String [] args){
//		Animal a1 = new Animal();
//		a1.mananca();

		Felina f1 = new Felina();
		f1.zgarie();
		f1.mananca();
		f1.culoare = "gri";
		f1.afiseazaCuloare();

		Pisica p1 = new Pisica();
		p1.mananca();
	}
}
