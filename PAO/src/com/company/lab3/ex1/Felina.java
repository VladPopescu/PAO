package com.company.lab3.ex1;

public class Felina extends Animal {

	//Cuvantul cheie super permite accesarea atributelor si metodelor superclasei.
	// Astfel, in constructorul din subclasa se poate accesa constructorul din clasa de baza.

	public Felina(){
		super.afiseazaCuloare();
	}

	public void zgarie(){
		System.out.println("Felina Zgarie");
	}

	@Override
	public void mananca() {
		System.out.println("Felina mananca");
	}
}
