package org.tinylibrary.data;

import java.util.List;

public record PatronDto(
        Long id,
        String name,
        List<BookDto> requestedBooks
) { }
