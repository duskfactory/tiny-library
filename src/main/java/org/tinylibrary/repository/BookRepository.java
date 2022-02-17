package org.tinylibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tinylibrary.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
