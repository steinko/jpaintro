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
	public void existAPubliser() {
		Book book = new Book();
		String publisher = "Cool Gay";
		book.setPublisher(publisher);
		assertEquals(book.getPublisher(), publisher);
		
	}
	
	@Test
	public void existIsbn() {
		Book book = new Book();
		String isbn = "978-82-450-0364-2";
		book.setIsbn(isbn);
		assertEquals(book.getIsbn(), isbn);
		
	}

}