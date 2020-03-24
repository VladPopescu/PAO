package com.company.lab1;

public class Lab1Ex5 {

	public static void main(String[] args) {
		int[] valoriInt = { 10, 12, 5, -4, 3, -1, 23 };
		int valoareNegativa = 0;
		for (int j = 0; j < valoriInt.length; j++) {
			if (valoriInt[j] < 0) {
				//daca este negativ
				//salvez valoarea
				valoareNegativa = valoriInt[j];
				//iesim din bucla
				break;
			}
		}
		System.out.println("Prima valoare negativa este  " + valoareNegativa);
	}
}
