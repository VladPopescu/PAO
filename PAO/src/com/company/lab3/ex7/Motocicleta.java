package com.company.lab3.ex7;

public class Motocicleta extends Vehicul{

	public Motocicleta(String culoare) {
		super(culoare);
	}

	@Override
	void porneste() {
		System.out.println("Porneste motocicleta");
	}

	@Override
	void opreste() {
		System.out.println("Opreste motocicleta");
	}

	@Override
	void afiseazaViteza() {
		System.out.println("Motocicleta are viteza maxima " + super.getViteza());
	}
}
