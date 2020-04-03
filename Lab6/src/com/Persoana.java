package com;

public class Persoana {

	private String nume;

	private int varsta;

	private long CNP;

	public Persoana(String nume, int varsta, long cnp){
		this.nume = nume;
		this.varsta = varsta;
		this.CNP = cnp;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public long getCNP() {
		return CNP;
	}

	public void setCNP(long CNP) {
		this.CNP = CNP;
	}
}
