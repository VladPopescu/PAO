package com.company.lab3.ex7;

public abstract class Vehicul {

	private int viteza;

	private String culoare;

	public Vehicul(String culoare){
		this.culoare = culoare;
	}

	abstract void porneste();

	abstract void opreste();

	public int getViteza() {
		return viteza;
	}


	abstract void afiseazaViteza();

	public void setViteza(int viteza) {
		this.viteza = viteza;
	}
}
