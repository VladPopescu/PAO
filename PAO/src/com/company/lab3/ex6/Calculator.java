package com.company.lab3.ex6;

public class Calculator {

/*
	Fiecare clasa Java este derivata din clasa Object.
	Este "Strabunicul" tuturor claselor din Java
	Metodele acestei clase sunt importante deoarece ele sunt mostenite de toate clasele Java si intre aceste metode Java sunt si o serie de metode publice.
 */

	public static void main(String [] args){
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();

//		String s1 = "Pop Ion";
//		String s2 = "Pop Ioaan";
//		String s3 = s1;
		// este folosita pentru convertirea obiectelor la o valoare de tip String
		System.out.println(c1.toString());

		System.out.println(c1.getClass());
		// se utilizeaza pentru compararea obiectelor. in acest caz se compara continutul obiectelor, adica tipul acestora si dupa aceea se compara valorile.
		System.out.println(c1.equals(c2));

		String s3 = new String("HELLO");
		String s4 = new String("HELLO");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		String s5 = "HELLO";
		String s6 = "HELLO";

		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));

		System.out.println(c2.hashCode());
	}
}
