package org.tinylibrary.ports.spi;

import org.tinylibrary.data.BookDto;

import java.util.List;

public interface BookPersistencePort {
    BookDto addBook(BookDto book);
    void deleteBookById(Long id);
    BookDto updateBook(BookDto book);
    BookDto getBookById(Long id);
    List<BookDto> getAllBooks();
    List<BookDto> getBooksByStatus(String status);
}
