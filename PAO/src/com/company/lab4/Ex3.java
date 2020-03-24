package com.company.lab4;

public class Ex3 {

	/*
	Clasa StringBuilder la fel ca StringBuffer e folosita  pentru a face obiectele String mutable.
	 Prin urmare, aceste obiecte pot fi modificate.
	 Funcționalitatea este similară cu cea a StringBuffer, dar diferenta este ca nu asigură siguranța firelor de executie(deci nu este thread safe).
	 Lucru care face ca performanta StringBuilder-ului sa fie mai buna ca cea a StringBuffer-ului.

	* */

	public static void main(String [] args){
		StringBuilder s1 = new StringBuilder ("Hello");

		s1.append ( "World");
		System.out.println (s1);
	}
}
