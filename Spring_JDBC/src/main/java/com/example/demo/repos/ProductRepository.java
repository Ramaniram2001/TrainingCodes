package com.example.demo.repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;
import com.example.demo.ifaces.CrudRepository;


@Repository
public class ProductRepository implements CrudRepository<Product> {
	
	private JdbcTemplate template;

	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}
	@Override
	public int add(Product t) {
		String sql="insert into HARI_PRODUCT values(?,?,?)";
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
	}
	@Override
	public List<Product> findAll() {
		String sql="select * from HARI_PRODUCT";
		return template.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
		
		
	}
	@Override
	public  Product findById(int id) {
		try {
			String sql="Select * from HARI_PRODUCT where product_id=?";
			return template.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),id);
		}catch (IncorrectResultSizeDataAccessException e)    	{
		      return null;
	    }
		}
	@Override
	public int update(Product t) {
	String sql="UPDATE HARI_PRODUCT SET product_Name=?,price=?  where product_Id= ?" ;
	return template.update(sql,new Object[] {t.getProductName(),t.getPrice(),t.getProductId()});
	}
	@Override
	public int remove(int id) {
		String sql="Delete from HARI_PRODUCT where product_id=?";
		return template.update(sql,id);
	
	}



}
