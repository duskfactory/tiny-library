package org.tinylibrary.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tinylibrary.domain.data.BookDto;
import org.tinylibrary.domain.ports.api.BookServicePort;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookServicePort bookServicePort;

    @PostMapping("/")
    public BookDto addBook(@RequestBody BookDto bookDto) {
        return bookServicePort.addBook(bookDto);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable long id) {
        bookServicePort.deleteBookById(id);
    }

    @PutMapping("/")
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        return bookServicePort.updateBook(bookDto);
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable long id) {
        return bookServicePort.getBookById(id);
    }

    @GetMapping("/all")
    public List<BookDto> getAllBooks() {
        return bookServicePort.getAllBooks();
    }

    @GetMapping("/status/{status}")
    public List<BookDto> getBooksByStatus(@PathVariable String status) {
        return bookServicePort.getBooksByStatus(status);
    }
}
