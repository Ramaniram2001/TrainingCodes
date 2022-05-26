package com.example.demo.repos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
import com.example.demo.ifaces.CrudRepository;


@Repository
public class StudentRepository implements CrudRepository<Student> {
	
	@Autowired
	private JdbcTemplate template;


	public StudentRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	
	@Override
	public int add(Student t) {
		String addSql="insert into HARI_STUDENT101 values(?,?,?,?)";
		return template.update(addSql,t.getRollNo(),t.getStudentName(),t.getMarksScored(),t.getStudentRank());
	}
		


	@Override
	public List<Student> findAll() {
		String findAllSql="select * from hari_student101";
		return template.query(findAllSql,BeanPropertyRowMapper.newInstance(Student.class));
	}

	@Override
	public Student findById(int id) {
		try {
			String sql="Select * from HARI_STUDENT101 where roll_No=?";
			return template.queryForObject(sql,BeanPropertyRowMapper.newInstance(Student.class),id);
		}catch (IncorrectResultSizeDataAccessException e)    	{
		     return null;
	    }
		}

	@Override
	public List<Student> findByRank(String rank) {
		try {
			String sql="Select * from HARI_STUDENT101 where student_rank=?";
			return template.query(sql,BeanPropertyRowMapper.newInstance(Student.class),rank);
		}catch (IncorrectResultSizeDataAccessException e)    	{
		     return null;
	    }
	
	}

	@Override
	public int update(Student t) {
		String sql="UPDATE HARI_STUDENT101 SET student_rank=?,marks_Scored=? where roll_No= ?" ;
		return template.update(sql,new Object[] {t.getStudentRank(),t.getMarksScored(),t.getRollNo()});
	}

	@Override
	public int remove(int id) {
		String sql="DELETE FROM HARI_STUDENT101 WHERE ROLL_NO=?";
		return template.update(sql,id);
	}


	

}
