package com.ex3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\JustBeRepos\\Lab6\\src\\com\\fileOutput.txt");

		//		if (file.exists()){
		//			System.out.println("Fisierul exista!");
		//		} else {
		//			System.out.println("Fisierul nu este creat!");
		//		}

		FileReader fileReader = new FileReader(file);

		FileWriter fileWriter = new FileWriter(file);

		int x = fileReader.read();
		System.out.println("Valoare ASCII : " + x);
		System.out.println("Valoare caracter : " + (char) x);
		fileWriter.write('a');
		fileWriter.close();
	}
}
