package com.ex4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String [] args){
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("testout.txt", true);
			String s = "Welcome to PAO";
			fileOutputStream.write(s.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			System.out.println("IOException");
		}
	}
}
