package com.pao.examen.part3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordReader {

//	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
//
//		String word = scanner.nextLine();
//		int count = 0;
//
//		File file = new File("src/com/pao/examen/part3/fileName.txt");
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		String line;
//		while ((line = br.readLine()) != null) {
//			String[] words = line.split("\\W+");
//			for (int i = 0; i < words.length; i++) {
//				if (words[i].equals(word)) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
//
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		ThreadWordCounter threadWordCounter = new ThreadWordCounter("src/com/pao/examen/part3/fileName.txt", word);
		threadWordCounter.start();
	}
}
