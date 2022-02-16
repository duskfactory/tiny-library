package org.tinylibrary.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylibrary.data.BookDto;
import org.tinylibrary.data.PatronDto;
import org.tinylibrary.ports.spi.PatronPersistencePort;
import org.tinylibrary.repository.PatronRepository;

import java.util.List;

@Service
public class PatronJpaAdapter implements PatronPersistencePort {

    @Autowired
    private PatronRepository patronRepository;

    @Override
    public PatronDto addPatron(PatronDto patron) {
        return null;
    }

    @Override
    public void deletePatronById(Long id) {

    }

    @Override
    public void addRequest(BookDto book) {

    }

    @Override
    public void removeRequestById(Long bookId) {

    }

    @Override
    public PatronDto getPatronById(Long id) {
        return null;
    }

    @Override
    public List<PatronDto> getAllPatrons() {
        return null;
    }
}
