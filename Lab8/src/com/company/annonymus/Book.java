package com.company.annonymus;

public class Book {

	public Book() {
	}

	public Book(String s) {
		System.out.println(s);
	}

	public String description() {
		return "Book";
	}

	public Page getPage(int pageNo) {
		return new Page() {

			private int pageNo = 10;

			public int getPageNo() {
				return pageNo;
			}
		};
	}

}
