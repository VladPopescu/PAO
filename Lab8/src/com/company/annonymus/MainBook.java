package com.company.annonymus;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainBook {

	/*
		- exista situatii cand o componenta a aplicatiei are o utilitate suficient de mare pentru a fi considerata
		o entitate separata ( sau clasa). Dar , avem si foarte multe cazuri cand nu este utilizata decat in portiuni
		restranse din cod, intr-un context foarte specific , si nu are rost sa cream ca o clasa standalone

		- daca intr-o aplicatie reala, pentru orice componenta cream o clasa, o sa ajungem la fenomenul numit "Class Explosion"
		cea ce inseamna o aplicatie cu performante scazute, care este greu de modificat si extins

		- pentur a evita acest fenomen putem folosi clase anonime in locul definirii unei clase cu numar de utilizari redus

		Clasele anonime:
		- nu au nume si apar in program ca instante ale unei clase mostenite (sau a unei interfete extinse), care suprascriu (sau)
		implementeaza anumite metode
		- nu pot avea constructori, din cauza ca nu au nume.
		- deci implicit foloseste constructorul default
		- putem apela constructori diferiti

	 */
	public static void main(String args[]){

		Book book = new Book(){
			@Override
			public String description(){
				return "Famous Book";
			}
		};
		System.out.println(book.description());
		System.out.println(book.getPage(10).getPageNo());


		Book book1 = new Book("s1"){
			@Override
			public String description(){
				return "Famous Book";
			}
		};


		/* În Java, clasele interioare anonime oferă o modalitate de a implementa clase care apar doar o singură dată într-o aplicație.
		 De exemplu, o aplicație standard Swing sau JavaFX necesită mai multe dispozitive de tratare a evenimentelor pentru tastatură și mouse.
		 În loc să scrieți o clasă separată pentru fiecare eveniment, prescrieți o comandă comună.
		 Prin crearea unei clase pe loc unde este nevoie, codul devine mult mai ușor de citit.
			Bibliotecile pentru interfetele grafice(Swing, Awt) folosesc clase interne, pentru definirea unui comportament pentru un element grafic
		*/
		Button button = new Button();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("S-a dat click pe button");
			}
		});
	}
}
