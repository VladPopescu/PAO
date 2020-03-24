package com.company.lab1;

public class Lab1Ex4 {

	/*
		Structura conditionala switch implementeaza o structura conditionala cu mai multe ramuri de executie.
		 Inlocuieste intr-un mod mai eficient o structura if-then-else cu multe ramuri else sau then.
		 Valori acceptate de switch:
		 	- primitive:  byte, short, char, int
		 	- enum
		 	- String
		 	- clase wrapper:  Character, Byte, Short, and Integer
	 */
	public static void main(String [] args){
		int valoareTest = 2;
		Integer wrapperInt = 5;
		switch(wrapperInt)
		{
			case 1:
				System.out.println("Valoarea este egala cu 1");
				break;
			case 2:
				System.out.println("Valoarea este egala cu 2");
				break;
			case 3:
				System.out.println("Valoarea este egala cu 3");
				break;
			case 4:
				System.out.println("Valoarea este egala cu 4");
				break;
			default:
				System.out.println("Valoarea este in afara intervalului");
		}
	}
}
