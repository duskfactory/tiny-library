package org.tinylibrary.ports.api;

import org.tinylibrary.data.LoanDto;

public interface LoanServicePort {
    LoanDto addLoan(LoanDto loan);
    void deleteLoanById(Long id);
    LoanDto getLoanById(Long id);
}
