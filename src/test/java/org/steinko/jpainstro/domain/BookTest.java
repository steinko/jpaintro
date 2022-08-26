package org.steinko.jpainstro.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
	
	Book book;
	
	@BeforeEach
	public void initEach(){
	    book = new Book();
	}
	
	@Test
	public void exists() {
		
		assertNotNull(book);
	}
	
	@Test
	public void existATitle() {
		
		String title = "Programimg Java";
		book.setTitle(title);
		assertEquals(book.getTitle(), title);
		
	}
	
	@Test
	public void existIsbn() {
		
		String isbn = "978-82-450-0364-2";
		book.setIsbn(isbn);
		assertEquals(book.getIsbn(), isbn);
		
	}
	
	@Test
	public void existAPublisher() {
	
		String publisher = "Askehouge";
		book.setPublisher(publisher);
		assertEquals(book.getPublisher(), publisher);
		
	}

}