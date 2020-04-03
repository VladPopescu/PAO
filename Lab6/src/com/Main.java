package com;

public class Main {

	public static void main(String [] args) throws ValoareDepasitaException {
		Persoana p = new Persoana("Gheorge", 40, 1930823160123432L);

		long cnp = p.getCNP();
		int count = 0;
		while (cnp != 0) {
			count++;
			cnp = cnp/10;
		}
		if (count > 13){
			throw new ValoareDepasitaException("S-a depasit lungimea maxima a CNP-ului");
		}
	}
}
