package com.training;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;


public class Application {
public static void print(List<Book> books) {
	 
//	for(Book eachBook: books) {
//		System.out.println(eachBook);
//	}
	//the above is also used or the below one is method reference 
	//which is from functional interfaces
	books.forEach(System.out::println);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book java = new Book(101, "java", "subha", 450);
Book Spring = new Book(102, "Spring", "Mad", 650);
Book Maven = new Book(103, "Maven", "Harish", 550);
Book html = new Book(104, "html", "Priya", 1450);
Book python = new Book(105, "Python", "Sathya", 850);

CrudRepository service = new BookService();


List<Book> bookList=((BookService)service).getBooksGrtThan(400);
System.out.println("^^^^^^^^^^^^");
bookList.forEach(System.out::println);
System.out.println("is Added:=" +service.add(java));
System.out.println("is Added:=" +service.add(Maven));
System.out.println("is Added:=" +service.add(Spring));
System.out.println("is Added:=" +service.add(html));
System.out.println("is Added:=" +service.add(python));

List<Book> bookList1 = service.findAll();
for(Book eachbook : bookList1) {
	System.out.println(eachbook);
	System.out.println(eachbook.getBookNumber());
	System.out.println(eachbook.getBookName());
	System.out.println(eachbook.getAuthor());
	System.out.println(eachbook.getPrice());
}
print(service.findAll());
	
Book foundBook = service.findById(101);

System.out.println("Found" +foundBook);

service.remove(html);
System.out.println("============");
List<Book> secondList = service.findAll();
//for(Book eachBook : secondList) {
//	System.out.println(eachBook);
//}
System.out.println("==========");

print(service.findAll());
Book react= new Book(106, "react", "hp", 10000);
service.add(react);
print(service.findAll());
Book reactNew= new Book(108, "reactjs", "hprasada", 16000);
service.update(react,reactNew);
System.out.println("========================");
print(service.findAll());




}
}