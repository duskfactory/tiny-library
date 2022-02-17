package org.tinylibrary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tinylibrary.infrastructure.adapters.BookJpaAdapter;
import org.tinylibrary.domain.ports.api.BookServicePort;
import org.tinylibrary.domain.ports.spi.BookPersistencePort;
import org.tinylibrary.domain.service.BookService;

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
