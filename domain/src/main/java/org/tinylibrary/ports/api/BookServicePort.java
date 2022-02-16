package org.tinylibrary.ports.api;

import org.tinylibrary.data.BookDto;
import org.tinylibrary.data.PatronDto;

import java.util.List;

public interface BookServicePort {
    BookDto addBook(BookDto book);
    void deleteBookById(Long id);
    BookDto updateRemark(String remark);
    BookDto updateStatus(String status);
    void addRequest(PatronDto patron);
    void removeRequestById(Long patronId);
    BookDto getBookById(Long id);
    List<BookDto> getAllBooks();
    List<BookDto> getBooksByStatus(String status);
}
