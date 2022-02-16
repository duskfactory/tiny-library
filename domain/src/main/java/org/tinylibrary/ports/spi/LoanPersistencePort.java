package org.tinylibrary.ports.spi;

import org.tinylibrary.data.LoanDto;

public interface LoanPersistencePort {
    LoanDto addLoan(LoanDto loan);
    void deleteLoanById(Long id);
    LoanDto getLoanById(Long id);
}
