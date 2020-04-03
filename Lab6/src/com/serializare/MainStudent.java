package com.serializare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainStudent {

	public static void main(String [] args ){

		Student student1 = new Student("Vlad", 50, "Alex");
		Student student2 = new Student("Mihai", 10, "George");

		try {
//			FileOutputStream f = new FileOutputStream(new File("objectFile.txt"));
//			ObjectOutputStream o = new ObjectOutputStream(f);
//
//			o.writeObject(student1);
//			o.writeObject(student2);
//
//			o.close();
//			f.close();

			FileInputStream fileInputStream = new FileInputStream(new File("objectFile.txt"));
			ObjectInputStream oi = new ObjectInputStream(fileInputStream);

			Student student3 =(Student) oi.readObject();
			Student student4 =(Student) oi.readObject();

			oi.close();
			fileInputStream.close();

			System.out.println(student3.toString());
			System.out.println(student4.toString());


		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
