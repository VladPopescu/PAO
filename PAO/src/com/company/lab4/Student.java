package com.company.lab4;

public final class Student {

	/* 
	   Ca o clasa sa fie imutabila, trebuie sa respected urmatoarele reguli:
	    - clasa trebuie declarata finala
	    - atributele clasei trebuie declarati cu final
	    - un constructor parametrizat, ca sa setam initial valorile care nu o sa se mai schimbe
	    - metode de get pentru toate variabilele din clasa
	    - fara setteri, valorile pe care le primvesc variabilele din clasa, nu se mai schimba
	 */


		final String name;
		final int regNo;

		public Student(String name, int regNo)
		{
			this.name = name;
			this.regNo = regNo;
		}
		public String getName()
		{
			return name;
		}
		public int getRegNo()
		{
			return regNo;
		}


}
