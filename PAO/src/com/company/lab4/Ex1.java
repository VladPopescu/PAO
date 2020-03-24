package com.company.lab4;

public class Ex1 {

	public static void main(String [] args){


		String sir = "This is a string";
		System.out.println(sir);
		Integer integer = 5;



		String sir2 = new String("This is a string");
		System.out.println(sir2);

		/*
		 cele doua secvente de cod nu sunt perfect echivalente deoarece
		constanta “Un sir de caractere” este deja un obiect. Prin urmare, in primul exemplu
		variabila sir va referi obiectul creat implicit de compilator, pe cand in al doilea exemplu variabila va referi un obiect String ce copiaza continutul obiectului creat implicit
		de compilator.
		 */

		// avem un constructor in clasa String, care accepta ca parametru un vector de caractere si construieste el in spate sirul
		char[] arrayOfChar = {'u','n',' ','s','i','r'};
		String sir1 = new String(arrayOfChar);
		System.out.println(sir1);


		System.out.println(String.valueOf(5));
		System.out.println(String.valueOf(5f));
		System.out.println(String.valueOf(6L));
		System.out.println(String.valueOf(20.0));
		System.out.println(String.valueOf('c'));
		System.out.println(String.valueOf(true));


		// Alte metoda care exista in clasa String, este length(), care ne intoarce lungimea unui sir de caractere

		String sir4 = new String("Un sir de caractere foarte lung a carui lungime nu o stiam dar putem sa o aflam");
		System.out.println(sir4.length());

		String sir5 = null;
//		System.out.println(sir5.length());


		String sir6 = "Sunt un Sir DE Caractere";
		System.out.println(sir6.toUpperCase());
		System.out.println(sir6.toLowerCase());


		String sir7 = "Abracadabra Hocus Pocus";
 		// care o sa afiseze substring-ul incepand cu caracterul de pe pozitia data de noi
		System.out.println(sir7.substring(10)); //[ ]
		System.out.println(sir7.substring(10,16)); //[ )

		//metoda de comparare de string-uri
		String sir8 = "sir caractere";
		String sir9 = "sir caractere";
		String sir10 = "siR cAractere";
		System.out.println(sir8.equals(sir9));
		System.out.println(sir8.equalsIgnoreCase(sir10));


		String sir11 = "Un sir care contine mai multe cuvinte care se repeta";
		String cuvant = "care";
		System.out.println(sir11.contains(cuvant));
		System.out.println(sir11.replace(cuvant, "inlocuitor"));


		String regex = "(.*)abc(.*)";
		String sir12 = "abc a ab dcva";
		System.out.println(sir12.matches(regex));
	}
}
