package com.training.Book;

public class Book1 {
	private int bookId;
	private String bookName;
	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book1(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book1 [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	

}
