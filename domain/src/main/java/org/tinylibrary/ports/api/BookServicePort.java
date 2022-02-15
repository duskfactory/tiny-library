package org.tinylibrary.ports.api;

import org.tinylibrary.data.BookDto;

import java.util.List;

public interface BookServicePort {
    BookDto addBook(BookDto book);
    void deleteBookById(Long id);
    BookDto updateRemark(String remark);
    BookDto updateStatus(BookDto.Status status);
    BookDto getBookById(Long id);
    List<BookDto> getAllBooks();
    List<BookDto> getBooksByStatus(BookDto.Status status);
}
