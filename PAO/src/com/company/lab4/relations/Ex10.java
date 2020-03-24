package com.company.lab4.relations;

public class Ex10 {
	/*

	*
	* Agregarea și compunerea se referă la prezența unei referințe pentru un obiect într-o altă clasă. Acea clasă practic va refolosi codul din clasa corespunzatoare obiectului. Exemplu:
	*
	* Compozitia este o relatie de tipul "belongs-to". Asta putem sa o traducem in idea ca un obiect cu o structura mai mare, contine
	* un alt obiect, sau mai bine zis ca este mebru al obiectului mai mare. Putem sa o numim si o relatie de tipul "has-a"
	*
	*
	* Compunere:
		<code java>
			public class Foo {
				private Bar bar = new Bar();
			}
		</code>
	*
	*
	* Agregare:
		<code java>
		public class Foo {
			private Bar bar;

			// Obiectul Bar poate continua să existe chiar dacă obiectul Foo nu există
			Foo(Bar bar) {
			   this.bar = bar;
			}
		}
	*
* */
}
