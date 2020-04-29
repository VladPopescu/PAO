package com.company.ex7;

public class TableMultiply {

	public synchronized void printMultiplyTable(int n){
		for (int i = 1; i< 5 ; i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			} catch (InterruptedException e ){
				e.printStackTrace();
			}
		}
	}
}
