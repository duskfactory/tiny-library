package org.tinylibrary.ports.api;

import org.tinylibrary.data.BookDto;
import org.tinylibrary.data.PatronDto;

import java.util.List;

public interface PatronServicePort {
    PatronDto addPatron(PatronDto patron);
    void deletePatronById(Long id);
    void addRequest(BookDto book);
    void removeRequestById(Long bookId);
    PatronDto getPatronById(Long id);
    List<PatronDto> getAllPatrons();
}
