package org.tinylibrary.adapters;

import org.tinylibrary.data.LoanDto;
import org.tinylibrary.ports.spi.LoanPersistencePort;

public class LoanJpaAdapter implements LoanPersistencePort {
    @Override
    public LoanDto addLoan(LoanDto loan) {
        return null;
    }

    @Override
    public void deleteLoanById(Long id) {

    }

    @Override
    public LoanDto getLoanById(Long id) {
        return null;
    }
}
