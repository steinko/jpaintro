package org.steinko.jpainstro.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
	
	@Test
	public void exists() {
		Book book = new Book();
				assertNotNull(book);
		
	}
	
	@Test
	public void existATitle() {
		Book book = new Book();
		String title = "Programimg Java";
		book.setTitle(title);
		assertEquals(book.getTitle(), title);
		
	}
	
	@Test
	public void existIsbn() {
		Book book = new Book();
		String isbn = "978-82-450-0364-2";
		book.setIsbn(isbn);
		assertEquals(book.getIsbn(), isbn);
		
	}
	
	@Test
	public void existAPublisher() {
		Book book = new Book();
		String publisher = "Askehouge";
		book.setPublisher(publisher);
		assertEquals(book.getPublisher(), publisher);
		
	}

}