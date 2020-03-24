package com.company.lab3.ex4;

//		Polimorfismul de supraincarcare apare la definirea de metode cu acelasi nume in cadrul unei clase.
//		Diferenta intre metode se face prin numarul de parametri sau tipurile diferite ale acestor parametri.
//		Nu poate fi realizata supraincarcarea prin utilizarea de tipuri returnate diferite pentru metode.
public class Carte {

	String titlu;
	String autor;

	public Carte() {
		titlu = " ";
		autor = " ";
	}

	Carte(String titlu, String autor) {
		this.titlu = titlu;
		this.autor = autor;
	}

	void afiseazaCarte() {
		System.out.println("Titlu: " + titlu);
		System.out.println("Autor: " + autor);
	}

	void afiseazaCarte(int id) {
		System.out.println("Id: " + id);
		System.out.println("Titlu: " + titlu);
		System.out.println("Autor: " + autor);
	}

	public static void main(String[] args) {
		Carte c1 = new Carte("Morometii", "Marin Preda");
		Carte c2 = new Carte("Fratii Jderi", "Mihail Sadoveanu");
		c1.afiseazaCarte();
		System.out.println();
		c1.afiseazaCarte(1);
		System.out.println();
		c2.afiseazaCarte(2);
	}
}
