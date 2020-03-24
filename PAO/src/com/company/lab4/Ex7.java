package com.company.lab4;

public class Ex7 {

		public boolean firstInLast(String str)
		{
			if (str.length() < 2)
				return false;
			else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
				return true;
			else
				return false;
		}
		public static void main (String[] args)
		{
			Ex7 ex7 = new Ex7();

			String str1 =  "educated";

			System.out.println("The given strings is: "+str1);
			System.out.println("The first two characters appear in the last is: "+ ex7.firstInLast(str1));
		}

}
