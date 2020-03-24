package com.company.lab5.comparator.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {

	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name,
			String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name +
				" " + this.address;
	}

	public static void main(String [] args){
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new SortByRollNo());

		System.out.println("\nSorted by rollno");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new SortByName());

		System.out.println("\nSorted by name");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));

		Student[] students = new Student[4];
		students[0] = new Student(111, "abbb", "london");
		students[1] = new Student(110, "bbbb", "london");
		students[2] = new Student(114, "aabb", "london");
		students[3] = new Student(113, "cbbb", "london");

		Arrays.sort(students, new SortByRollNo());

		for (int i=0; i<students.length; i++){
			System.out.println(students[i].rollno + " " + students[i].name);
		}
	}
}

