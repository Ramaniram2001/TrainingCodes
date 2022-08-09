package com.example.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.model.Book;
/**
 * 
 * @author Haripriya.R
 *
 */
public class BookService {
	/**
	 * 
	 */
	private Set<Book> bookList;

	/**
	 * 
	 */
	public BookService() {
		super();
		this.bookList = new HashSet<>();
	}
/**
 * 
 * @return
 */
	public Set<Book> getBookList() {
		
		return this.bookList;
	}
/**
 * 
 * @param book
 * @return
 */
	public int addBook(Book book) {
		return this.bookList.add(book)?0:1;
}
	/**
	 * remove method
	 */
	public boolean removeBook(Book book) {
		boolean result=false;
		if(this.bookList.contains(book)) {
			this.bookList.remove(book);
			result=true;
		}else {
			throw new RuntimeException("Not there");
		}
		return result;
	}
	/**
	 * 
	 * @return
	 */
	public List<String> getBestBooks(){
		return Arrays.asList("Head First Java","PassBook","CookBook");
	
	}
	
	
}
