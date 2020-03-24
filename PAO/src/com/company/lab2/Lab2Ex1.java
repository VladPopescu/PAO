package com.company.lab2;

public class Lab2Ex1 {

	public static void main(String [] args){
		//Exista doua moduri de a declara un tablou primitiv

		// tipPrimitiv[] numeTablou
		int[] a;
		// tipPrimitiv numeTablou[]
		int b[];


		// Initializarea se poate face separat de declarare
		a = new int[100];
		// sau se pot face declararea si initializarea pe aceasi linie
		int []c = new int[100];

		int[] d;
		d = new int[5];
		// lungimea o sa fie 5
		System.out.println("Lungimea este: " + d.length);
		d = new int[0];
		// lungimea o sa fie 0
		System.out.println("Lungimea este: " + d.length);
		d = new int[-5];
		// lungimea o sa fie ??
		System.out.println("Lungimea este: " + d.length);


		int[] e = { 1, 2, 3, 4, 5 };
		char[] f = { 'a', 'b', 'c' };
		float[] g = { 5f, 6f, 7f };

	}
}
