package com.company.lab5.comparator.ex1;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}
