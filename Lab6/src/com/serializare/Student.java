package com.serializare;

import java.io.Serializable;

public class Student implements Serializable {


	private String nume;

	private int varsta;

	private String prenume;

	private static final long serialVersionUID = 1L;

	public Student(String nume, int varsta, String prenume) {
		this.nume = nume;
		this.varsta = varsta;
		this.prenume = prenume;
	}

	@Override
	public String toString() {
		return "Student{" +
				"nume='" + nume + '\'' +
				", varsta=" + varsta +
				", prenume='" + prenume + '\'' +
				'}';
	}
}
