package com.training;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	public List<Book> getAllBooks(){
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(2030,"Life with Java by Suhas"));
		return bookList;
	}
}
