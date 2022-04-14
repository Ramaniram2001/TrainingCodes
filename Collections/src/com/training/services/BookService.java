package com.training.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	
	private ArrayList<Book>bookList;
	
	
    public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
	    //boolean result=bookList.add(book);
		//return result
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		Book found=null;
		for (Book eachBook:this.bookList) {
			if (eachBook.getBookNumber()==id) {
				found=eachBook;
				
			}
		}
			return found;
			
		
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldbook,Book newBook) {
	      if(this.bookList.contains(oldbook)) {
	    	  //System.out.println("INSIDE IF BLOCK #######");
	    	  
	    	  int idxPos=this.bookList.indexOf(oldbook);
	    	  this.bookList.set(idxPos, newBook);
	      }
	    
		return newBook;
		
	}
	public List<Book> getBooksGrtThan(double price){
		//write using predicate and forEach
		List<Book> grtThanList=new ArrayList<>();
		Predicate<Double> grtThan =(value)->value>300.00;
		this.bookList.forEach(book->
		{
			double bookPrice=book.getPrice();
			if(grtThan.test(bookPrice)) {
				grtThanList.add(book);
			}
		});
		return grtThanList;
	}

}
