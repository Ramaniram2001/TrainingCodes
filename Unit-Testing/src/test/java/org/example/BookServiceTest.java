package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.model.Book;
import com.example.service.BookService;

public class BookServiceTest {
	
	BookService service=null;
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"Called");
	}
	
	@BeforeEach
	public void setUp(TestInfo info){
		service=new BookService();
		System.out.println(info.getDisplayName()+"Called");
	}
	@Test
	@DisplayName("Get Method should not return null value")
	void testGetBookMethod() {
		
		Object actual=service.getBookList();
		assertNotNull(actual);
		
	}

	@Test
	@DisplayName(value="add method should return 1 for success and 0 for failure to insert")
	void testAddMethod() {
		
		int actual=service.addBook(new Book());	
		int expected=0;
		assertEquals(expected,(int)actual);
		
	}
	
	@Test
	@DisplayName(value="add method should return 1 for success and 0 for failure to insert")
	void testAddBookMethod() {
	
		int actual=service.addBook(new Book());	
		int expected=0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	@DisplayName(value="addBook method should not accept duplicate value")
	void testMethod() {
	 assertAll("Testing add book",()->assertEquals(0,new Book(102,"java",450)),
			 ()->assertEquals(1,new Book(102,"java",450))
			 );
	}
	
	@Test
	@DisplayName(value="If the element is not found in the collection removeBook method should throw "
			+ "Runtime exception with message element not found")
	void removeMethod() {
		
		Throwable exception=assertThrows(RuntimeException.class,()->
		service.removeBook(new Book(102,"java",450)));
		assertEquals("Element not found",exception.getMessage());
		
	}
	
	@ParameterizedTest
	@DisplayName(value="Test if getBestBooks method has the value "
			+ "Head First Java in one first three positions")
	@ValueSource(ints= {0,1,2})
	void testPosition(int idxPos) {
		System.out.println(System.getProperty("os.name"));
		assumeTrue(System.getProperty("os.name").equals("windows 8.1"));
		assertEquals("Head First Java",service.getBestBooks().get(idxPos));
}
	
	
	
	
	
}
