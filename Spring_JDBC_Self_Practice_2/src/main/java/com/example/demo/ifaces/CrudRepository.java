package com.example.demo.ifaces;

import java.util.List;

public interface CrudRepository<T> {
	public int add(T t);
	public List<T> findAll();
	public T findById(int id);
	public List<T> findByRank(String rank);
	public int update(T t);
	public int remove(int id);
	
	/*in order to perform operations on the whole properties,
	Student t must be in the round bracket,Ex(add,update)*/
	
	/*in order to perform operations on one property give the particular property*/
	
	
	

}
