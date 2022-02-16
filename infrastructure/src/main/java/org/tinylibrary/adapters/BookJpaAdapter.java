package org.tinylibrary.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylibrary.data.BookDto;
import org.tinylibrary.data.PatronDto;
import org.tinylibrary.entity.Book;
import org.tinylibrary.mappers.BookMapper;
import org.tinylibrary.ports.spi.BookPersistencePort;
import org.tinylibrary.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookJpaAdapter implements BookPersistencePort {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto addBook(BookDto bookDto) {
        Book book = BookMapper.INSTANCE.bookDtoToBook(bookDto);
        Book bookSaved = bookRepository.save(book);
        return BookMapper.INSTANCE.bookToBookDto(bookSaved);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto updateRemark(String remark) {
        return addBook();
    }

    @Override
    public BookDto updateStatus(String status) {
        return addBook();
    }

    @Override
    public void addRequest(PatronDto patron) {

    }

    @Override
    public void removeRequestById(Long patronId) {

    }

    @Override
    public BookDto getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.map(BookMapper.INSTANCE::bookToBookDto).orElse(null);
    }

    @Override
    public List<BookDto> getAllBooks() {
        return null;
    }

    @Override
    public List<BookDto> getBooksByStatus(String status) {
        return null;
    }
}
