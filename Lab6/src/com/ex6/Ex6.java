package com.ex6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6 {


	public static void main(String [] args){
		try(Scanner scanner = new Scanner(new File("test.txt"));
				Scanner scanner2 = new Scanner(new File("test.txt"));)
		{

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
