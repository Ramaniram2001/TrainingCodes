package com.example.demo.ifaces;

import java.util.List;










public interface CrudRepository<T>
//this <T> represents ther entity class which is product
{
	public int add(T t);
	public List<T> findAll();
	
	public T findById(int id);
	public int update(T t);
	public int remove(int id);


}
