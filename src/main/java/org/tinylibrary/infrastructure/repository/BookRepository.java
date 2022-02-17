package org.tinylibrary.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tinylibrary.infrastructure.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
