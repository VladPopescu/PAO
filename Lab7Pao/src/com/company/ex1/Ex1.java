package com.company.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex1 {

	public static void main(String [] args){
		List<String> list = new ArrayList<>();
		list.add("list1");
		list.add("list2");
		list.add("list3");
		System.out.println(list);
		list.remove("list3");
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(0));

		list.isEmpty();
		list.indexOf("list1");
		Iterator iterator = list.iterator();
//		while (iterator.hasNext()){
//			System.out.println(iterator.next());
//			iterator.remove();
//			System.out.println(iterator.hasNext());
//		}

		ListIterator listIterator = list.listIterator();
		listIterator.hasPrevious();
		listIterator.add("String");listIterator.add("String1");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}


		ArrayList<String> list1 = new ArrayList<>();


		List<String> newList = Arrays.asList("1", "2", "3");
		System.out.println(newList);
//		newList.add("4");
//		newList.remove(0);


		ArrayList<Object> objects = new ArrayList<>();
		ArrayList<ArrayList<String>> objectsList = new ArrayList<>();
		ArrayList<String> objectsListString = new ArrayList<>();
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
	}
}
