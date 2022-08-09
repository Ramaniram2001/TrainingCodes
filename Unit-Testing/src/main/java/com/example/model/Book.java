package com.example.model;
/**
 * 
 * @author Haripriya.R
 *
 */
public class Book {
	private int bookId;
	private String bookName;
	private double price;

	
	/**
	 * 
	 */
	public Book() {
		super();
		
	}
	/**
	 * 
	 * @param bookId
	 * @param bookName
	 * @param price
	 */
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	/**
	 * 
	 * @return
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * 
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * 
	 * @return
	 */
	
	public String getBookName() {
		return bookName;
	}
	/**
	 * 
	 * @param bookName
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	

}
