package com.ex2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String [] args) throws IOException {
		FileReader fileReader = null;
		try{
			System.out.println("Instructiuni");
			File file = new File("fisier.txt");
			 fileReader = new FileReader(file);
		}
		 catch ( IOException | ArithmeticException e1){

		 }
		finally {
			fileReader.close();
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Acesta este un mesaj in consola!");
		System.err.println("Aceasta este o eroare!");
		try {
			System.out.println(System.in.read());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
