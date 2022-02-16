package org.tinylibrary.service;

import org.tinylibrary.data.BookDto;
import org.tinylibrary.data.PatronDto;
import org.tinylibrary.ports.api.PatronServicePort;
import org.tinylibrary.ports.spi.PatronPersistencePort;

import java.util.List;

public class PatronService implements PatronServicePort {

    private final PatronPersistencePort patronPersistencePort;

    public PatronService(PatronPersistencePort patronPersistencePort) {
        this.patronPersistencePort = patronPersistencePort;
    }

    @Override
    public PatronDto addPatron(PatronDto patron) {
        return patronPersistencePort.addPatron(patron);
    }

    @Override
    public void deletePatronById(Long id) {
        patronPersistencePort.deletePatronById(id);
    }

    @Override
    public void addRequest(BookDto book) {
        patronPersistencePort.addRequest(book);
    }

    @Override
    public void removeRequestById(Long bookId) {
        patronPersistencePort.removeRequestById(bookId);
    }

    @Override
    public PatronDto getPatronById(Long id) {
        return patronPersistencePort.getPatronById(id);
    }

    @Override
    public List<PatronDto> getAllPatrons() {
        return patronPersistencePort.getAllPatrons();
    }
}
