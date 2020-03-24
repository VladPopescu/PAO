package com.company.lab3.ex2;

public abstract class Shape {

	/*
	Clasele abstracte se declara folosind cuvantul abstract inaintea lui "class".
	La aceste tipuri de clase nu se poate crea instanta de obiect, ele pot fi doar mostenite de alte clase extinse din ele.
	In clasele abstracte se definesc si metode abstracte, acestea se declara cu acelasi cuvant "abstract" si fara corpul de acolade,
	 doar numele si parantezele rotunde, cu parametri necesari.
	 */

	String shapeColor;

	public Shape(String shapeColor) {
		this.shapeColor = shapeColor;
	}

	abstract int calculateArea();

	abstract int calculatePerimeter();
}
