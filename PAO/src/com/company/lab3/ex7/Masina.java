package com.company.lab3.ex7;

public class Masina extends Vehicul {

	public Masina(String culoare) {
		super(culoare);
	}

	@Override
	void porneste() {
		System.out.println("Porneste masina...");
	}

	@Override
	void opreste() {
		System.out.println("Opreste masina...");

	}

	@Override
	void afiseazaViteza() {
		System.out.println("Masina are viteza maxima " + super.getViteza());

	}
}
