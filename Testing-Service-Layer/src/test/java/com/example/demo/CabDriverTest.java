package com.example.demo;



import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.mockito.BDDMockito.*;
import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

 



@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)
public class CabDriverTest {
	
	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver canna;
	private CabDriver munna;
	private CabDriver senna;
	private CabDriver ram;
	@BeforeAll
	void init() {
		 canna=new CabDriver(1000,"RamPrasad",8745,"Chennai",LocalDate.of(1997,10,11),5.5);
	 munna=new CabDriver(1001,"Radhika",8747,"Madurai",LocalDate.of(1997,11,14),2.5);
		 senna=new CabDriver(1002,"Raju",8748,"Ooty",LocalDate.of(1997,12,13),3.5);
		
	}
	
	@Test
	@DisplayName("Test find all method return a array")
	void testFindAll() throws Exception {
		
		List<CabDriver> list=new ArrayList<>();
		list.add(canna);
		list.add(munna);
		list.add(senna);	
		given(service.findAll()).willReturn(list);//for findall or get method
		
		mock.perform(MockMvcRequestBuilders.get("/api/v1/drivers")
				.contentType(MediaType.APPLICATION_JSON))
				
				.andExpect(status().isOk())
				
				.andExpect(jsonPath("$",hasSize(3)))
				.andExpect(jsonPath("$[2].driverName",is("Raju")));
		
		
	}
	@Test
	@DisplayName("Test post  method posts a new one")
	void testPost() throws Exception {
		 ram = new CabDriver(1004,"Ram",8746,"Chennai",LocalDate.of(1997,10,11),5.5);

		given(service.save(ram)).willReturn(ram);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
			.contentType(MediaType.APPLICATION_JSON)
		    .content(asJsonString(ram)))
				.andExpect(status().isCreated())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.driverName",is("Ram"))); 
		}
	
	@Test
	@DisplayName("test findById method returns the element")
	void testFindById() throws Exception{
		Optional<CabDriver> element=Optional.of(ram);
		given(service.findById(1004)).willReturn(element);
		mock.perform(MockMvcRequestBuilders.get("/api/v1/drivers/1004"))
		.andExpect(jsonPath("$.driverName", is("Ram")));
	}
	
	@Test
	@DisplayName("test deleteById method delete the element")
	void testDeleteById() throws Exception{
		mock.perform(MockMvcRequestBuilders.delete("/api/v1/drivers/delete/1004","1004")
		.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isNoContent());
	}
	

	

	public static String asJsonString(	CabDriver entity) {
		try {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(entity);
		} catch(Exception e) {
		throw new RuntimeException(e);
		}
		}



}
