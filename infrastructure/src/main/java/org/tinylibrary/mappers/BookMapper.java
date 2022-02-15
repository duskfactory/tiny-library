package org.tinylibrary.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tinylibrary.data.BookDto;
import org.tinylibrary.entity.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto bookToBookDto(Book book);

    Book bookDtoToBook(BookDto bookDto);

    List<BookDto> bookListToBookDtoList(List<Book> bookList);

    List<Book> bookDtoListToBookList(List<BookDto> bookDtoList);
}
