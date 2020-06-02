package com.pao.examen.part3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadWordCounter extends Thread{

	private String filePath;
	private String word;

	public ThreadWordCounter(String filePath , String word){
		this.filePath = filePath;
		this.word = word;
	}

	@Override
	public void run(){
		int count = 0;
		File file = new File(filePath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\W+");
				for (int i = 0; i < words.length; i++) {
					if (words[i].equals(word)) {
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
