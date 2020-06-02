package com.pao.examen.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Automobil> automobilList = new ArrayList<>();
		Automobil automobil1 = new Automobil();
		automobil1.setMarca("Citroen");
		automobil1.setCapacitate(2600);
		automobil1.setModel("C3");
		automobil1.setPret(12220);

		Automobil automobil2 = new Automobil();
		automobil2.setMarca("Dacia");
		automobil2.setCapacitate(4);
		automobil2.setModel("Logan");
		automobil2.setPret(3000);

		Automobil automobil3 = new Automobil();
		automobil3.setMarca("Dacia");
		automobil3.setCapacitate(2001);
		automobil3.setModel("Sandero");
		automobil3.setPret(5001);

		automobilList.add(automobil1);
		automobilList.add(automobil2);
		automobilList.add(automobil3);

		 automobilList.stream()
				.filter( a -> a.getPret() > 4999 )
				.sorted((a1,a2) -> Double.compare(a2.getPret(),a1.getPret()))
				.forEach( a -> System.out.println(a.toString()));


		 automobilList.stream().distinct().forEach( a-> System.out.println(a.getMarca()));

		  automobilList.stream().filter( a -> a.getCapacitate() > 2000 && a.getCapacitate() < 3000).forEach(c-> System.out.println(c.getCapacitate()));
	}
}
