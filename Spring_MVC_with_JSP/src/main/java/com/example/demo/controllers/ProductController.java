package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;


@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repo;
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		return "addProduct";
	}
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		int rowAdded=this.repo.add(entity);
		return "addProduct";
		//the below is the correct code for adding an element
		//but the above stmt is also correct but u get the same page as u 
		//enter the values
//		try {
//		rowAdded=this.repo.add(entity);
//			return "success";
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			return "failure";
//		}
	}

	
	@RequestMapping(value="/product/srch",method=RequestMethod.GET)
	public String initsearchForm(Model model) {
		return "searchProduct";
			
	}
	@RequestMapping(value="/product/srch",method=RequestMethod.POST)
	public String searchProduct(@RequestParam("id")int id,Model model) {
		Product entity= repo.findById(id);
		model.addAttribute("found", entity);
		return "showProduct";
			
	}
	@RequestMapping(value= "/product/delete", method = RequestMethod.GET)
	public String initDeleteForm(Model model) {
			
			model.addAttribute("title","deleteProducts");
			
			return "findProduct";
		}
	@RequestMapping(value= "/product/delete", method = RequestMethod.POST)

	public String deleteProduct(@RequestParam("id") int id,Model model) {
		
		int entity = repo.remove(id);

		model.addAttribute("delete",entity);
		return "deleteProduct";
	}
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String initIndexPage(Model model) {
		
		model.addAttribute("title","Product Management");
		
		return "index";
	}
}


