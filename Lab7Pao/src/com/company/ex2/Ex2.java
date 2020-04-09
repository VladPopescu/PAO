package com.company.ex2;

import java.util.LinkedList;

public class Ex2 {

	public static void main(String [] args){
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.push(4);
		linkedList.push(5);
		System.out.println(linkedList.get(3));
		System.out.println(linkedList.peek());
		System.out.println(linkedList.pop());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		linkedList.iterator();
		linkedList.listIterator();


	}
}
