package com.company.lab3.ex5;

public class Labrador extends Caine {


	//Declararea unei metode din subclasa care este deja prezentă în clasa părinte este cunoscută sub numele de metodă suprascrisa.
	// Suprascrierea se face astfel încât clasă copil, in cazul nostru... să își poată implementa propria metodă care este deja furnizată de clasa părinte.
	// În acest caz, metoda din clasa părinte este numită metodă suprascrisa, iar metoda din clasa copil este  metodă care suprascrie.

	@Override
	public void sunet() {
		System.out.println("Ham Ham");
	}
}
