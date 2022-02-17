package org.tinylibrary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tinylibrary.adapters.BookJpaAdapter;
import org.tinylibrary.ports.api.BookServicePort;
import org.tinylibrary.ports.spi.BookPersistencePort;
import org.tinylibrary.service.BookService;

@Configuration
public class BookConfig {

    @Bean
    public BookPersistencePort bookPersistence() {
        return new BookJpaAdapter();
    }

    @Bean
    public BookServicePort bookService() {
        return new BookService(bookPersistence());
    }
}
