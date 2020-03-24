package com.company.lab5.comparable.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Persoana implements Comparable<Persoana> {

	String nume;

	int varsta;

	public Persoana(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public int compareTo(Persoana p) {
		if (this.varsta == p.varsta) {
			return 0;
		} else if (this.varsta > p.varsta) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		ArrayList<Persoana> al = new ArrayList<>();
		al.add(new Persoana("Alex", 15));
		al.add(new Persoana("Vasile", 86));
		al.add(new Persoana("Daniel", 3));

		Collections.sort(al);

		for (Persoana p : al){
			System.out.println(p.nume + " " + p.varsta);
		}



		Persoana[] tablouPersoane = new Persoana[3];
		tablouPersoane[0] = new Persoana("Monica", 53);
		tablouPersoane[1] = new Persoana("Andreea", 32);
		tablouPersoane[2] = new Persoana("Oana", 2);
		Collections.sort(Arrays.asList(tablouPersoane));

		for (int i = 0; i < 3; i++) {
			System.out.println(tablouPersoane[i].varsta);
		}
	}

}
