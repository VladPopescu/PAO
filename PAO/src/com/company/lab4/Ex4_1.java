package com.company.lab4;

public class Ex4_1 {
	public static void main(String args[])
	{
		Student s = new Student("ABC", 101);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());

		// Uncommenting below line causes error
		// s.regNo = 102;
	}


	// Alte exemple de clase imutabile :
	// clasele wrapper java.lang.Integer, java.lang.Byte, java.lang.Character, java.lang.Short, java.lang.Boolean, java.lang.Long, java.lang.Double, java.lang.Float
}
