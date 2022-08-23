package org.steinko.jpainstro.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookTest {
	
	@Test
	public void exists() {
		Book book = new Book();
				assertNotNull(book);
		
	}

}
