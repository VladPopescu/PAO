package com.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String [] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		System.out.println("Citeste un numar intreg");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Citeste un sir de caractere");
		String  b = br.readLine();

		System.out.println("A-ti citit de la tastatura: " + a + " si " + b);
	}
}
