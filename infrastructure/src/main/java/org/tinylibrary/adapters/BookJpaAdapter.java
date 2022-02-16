package org.tinylibrary.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tinylibrary.data.BookDto;
import org.tinylibrary.mappers.BookMapper;
import org.tinylibrary.ports.spi.BookPersistencePort;
import org.tinylibrary.repository.BookRepository;

import java.util.List;

@Component
public class BookJpaAdapter implements BookPersistencePort {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto addBook(BookDto bookDto) {
        final var book = BookMapper.INSTANCE.bookDtoToBook(bookDto);
        final var bookSaved = bookRepository.save(book);
        return BookMapper.INSTANCE.bookToBookDto(bookSaved);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto updateBook(BookDto book) {
        return addBook(book);
    }

    @Override
    public BookDto getBookById(Long id) {
        return bookRepository.findById(id).map(BookMapper.INSTANCE::bookToBookDto).orElse(null);
    }

    @Override
    public List<BookDto> getAllBooks() {
        return BookMapper.INSTANCE.bookListToBookDtoList(bookRepository.findAll());
    }

    @Override
    public List<BookDto> getBooksByStatus(String status) {
        final var bookList = BookMapper.INSTANCE.bookListToBookDtoList(bookRepository.findAll());
        return bookList.stream().filter(book -> book.status().equals(status)).toList();
    }
}
