package com.example.ifaces;

import java.util.List;

public interface CrudRepository<Member> {
	public int add(Member obj);
	public List<Member> findAll();
	public int remove(int id);
	public Member findById(int id);
	public int update(int id,String obj);

}
