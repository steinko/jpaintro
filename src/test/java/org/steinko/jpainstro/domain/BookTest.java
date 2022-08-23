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

}
