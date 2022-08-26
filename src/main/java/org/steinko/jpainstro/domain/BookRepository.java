package org.steinko.jpainstro.domain;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	Book findByTitle (String title);
}
