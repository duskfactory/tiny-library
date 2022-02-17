package org.tinylibrary.service;

import org.tinylibrary.data.BookDto;
import org.tinylibrary.ports.api.BookServicePort;
import org.tinylibrary.ports.spi.BookPersistencePort;

import java.util.List;

public class BookService implements BookServicePort {

    private final BookPersistencePort bookPersistencePort;

    public BookService(BookPersistencePort bookPersistencePort) {
        this.bookPersistencePort = bookPersistencePort;
    }

    @Override
    public BookDto addBook(BookDto book) {
        return bookPersistencePort.addBook(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistencePort.deleteBookById(id);
    }

    @Override
    public BookDto updateBook(BookDto book) {
        return bookPersistencePort.updateBook(book);
    }

    @Override
    public BookDto getBookById(Long id) {
        return bookPersistencePort.getBookById(id);
    }

    @Override
    public List<BookDto> getAllBooks() {
        return bookPersistencePort.getAllBooks();
    }

    @Override
    public List<BookDto> getBooksByStatus(String status) {
        return bookPersistencePort.getBooksByStatus(status);
    }
}
