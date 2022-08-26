package org.steinko.jpainstro.domain;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class BookRepositoryIT {
	
	 @Autowired
	 private TestEntityManager entityManager;
	
	@Autowired
    private BookRepository repository;

    @Test
    public void shouldReturnABook () {
    	
        Book javaProgramming = new Book("Java Programming", "Askehaug", "123-23-04");
        entityManager.persist(javaProgramming);

        Book found = repository.findByTitle(javaProgramming.getTitle());
        assertEquals(found.getTitle(),javaProgramming.getTitle());
    }

}
