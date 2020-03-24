package com.company.lab4;

public class Ex2 {

		public static void main(String [] args){
			StringBuffer sb1 = new StringBuffer();
			sb1.append("sir1 ");
			sb1.append(1);
			sb1.append('c');
			System.out.println(sb1.toString());

			StringBuffer sb2 = new StringBuffer("Sir de caracterere");
		}

	public static void mainS(String[] args) {
		String myName = "Fred F. Flintstone";
		StringBuffer myInitials = new StringBuffer();
		int length = myName.length();

		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(myName.charAt(i))) {
				myInitials.append(myName.charAt(i));
			}
		}
		System.out.println("My initials are: " + myInitials);
	}

}
