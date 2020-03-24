package com.company.lab5.interfaces.ex8;

public class Main {

	public static void main(String [] args) throws CloneNotSupportedException {
		ClonnableObject object = new ClonnableObject();
		ClonnableObject other = (ClonnableObject) object.clone();

		ClonnableObject nonObject = new ClonnableObject();
		ClonnableObject otherNonOject = (ClonnableObject) nonObject.clone();
	}
}
