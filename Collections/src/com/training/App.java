package com.training;
import java.util.*;


import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;
public class App {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Zahir");
		names.add("Pavan");
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		Book java = new Book(101, "Java", "subha", 450);
		Book Spring = new Book(102, "Spring", "Mad", 650);
		Book Maven = new Book(103, "Maven", "Harish", 550);
		Book html = new Book(104, "Html", "Priya", 1450);
		Book python = new Book(1087, "Python", "Sathya", 850);
		
		CrudRepository service = new BookService();

		System.out.println("is Added:=" +service.add(java));
		System.out.println("is Added:=" +service.add(Maven));
		System.out.println("is Added:=" +service.add(Spring));
		System.out.println("is Added:=" +service.add(html));
		System.out.println("is Added:=" +service.add(python));

		
	List<Book> bookList=service.findAll();
	Collections.sort(bookList);
	System.out.println(bookList);
	
	BookNameComparator dec=new BookNameComparator();
	Collections.sort(bookList,dec);
	System.out.println(bookList);
	
	}

}
