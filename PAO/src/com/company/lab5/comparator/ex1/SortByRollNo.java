package com.company.lab5.comparator.ex1;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}
