package com.company.lab3.ex4;

public class Student extends Persoana {

	//Clasa Student introduce prin intermediul polimorfismului metoda sePrezinta().
	// Aceasta suprascrie metoda din superclasa Persoana care are acelasi nume si aceeasi semnatura.

	private double medie;
	private String facultate;

	public Student() {
		super();
		this.medie = 0.0;
		this.facultate = null;
	}

	public Student(String nume, int varsta, double inaltime, double medie, String facultate) {
		super(nume, varsta, inaltime);
		this.medie = medie;
		this.facultate = facultate;
	}

	public double getMedie() {
		return medie;
	}

	public String getFacultate() {
		return facultate;
	}

	@Override
	public void sePrezinta() {
		super.sePrezinta();
		System.out.printf("Sunt student la facultatea %s.%n", getFacultate());
	}

	public void sePrezinta(String salut) {
		System.out.printf("%s! ", salut);
		this.sePrezinta();
	}
}
