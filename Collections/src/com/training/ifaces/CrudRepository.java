package com.training.ifaces;
import com.training.model.Book;
import java.util.*;

//creudrepository means create,update,delete

public interface CrudRepository {
	
	
	public boolean add(Book book);
	public Book findById(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book oldbook,Book recentBook);

}
