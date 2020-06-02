package com.pao.examen.part1.p1;

public class Part1_2 {

	public static void main(String[] args) {
		test();
		// d) EX FIN END
	}
	static void test(){
		try{
			met();
		}
		catch (NullPointerException ex){
			System.out.print("NPE ");
		}
		catch (Exception ex){
			System.out.print("EX ");
		}
		finally{
			System.out.print("FIN ");
		}
		System.out.println("END");
	}


	static void met(){
		throw new IllegalArgumentException();
	}
}
