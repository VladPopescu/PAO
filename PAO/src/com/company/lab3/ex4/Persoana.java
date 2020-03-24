package com.company.lab3.ex4;

//	Polimorfismul de supradefinire apare in momentul in care metoda unei clase are acelasi nume si aceeasi semnatura cu o metoda din clasa de baza.
// Semnatura unei metode este data de numarul parametrilor, tipul si ordinea acestora.
// Spunem ca metoda din clasa derivata supradefineste metoda din clasa de baza, daca numele si semnaturile metodelor coincid.

public class Persoana {

	private String nume;
	private int varsta;
	private double inaltime;

	public Persoana() {
		this("Necunoscut", 0, 0.0);
	}

	public Persoana(String nume, int varsta, double inaltime) {
		this.nume = nume;
		this.varsta = varsta;
		this.inaltime = inaltime;
	}

	public Persoana(String nume) {
		this(nume, 0, 0.0);
	}

	public String getNume() {
		return this.nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public double getInaltime() {
		return inaltime;
	}

	public void sePrezinta() {
		System.out.printf("Numele meu este %s.%n", this.nume);
	}
}
