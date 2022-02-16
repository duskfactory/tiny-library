package org.tinylibrary.service;

import org.tinylibrary.data.LoanDto;
import org.tinylibrary.ports.api.LoanServicePort;
import org.tinylibrary.ports.spi.LoanPersistencePort;

public class LoanService implements LoanServicePort {

    private final LoanPersistencePort loanPersistencePort;

    public LoanService(LoanPersistencePort loanPersistencePort) {
        this.loanPersistencePort = loanPersistencePort;
    }

    @Override
    public LoanDto addLoan(LoanDto loan) {
        return loanPersistencePort.addLoan(loan);
    }

    @Override
    public void deleteLoanById(Long id) {
        loanPersistencePort.deleteLoanById(id);
    }

    @Override
    public LoanDto getLoanById(Long id) {
        return loanPersistencePort.getLoanById(id);
    }
}
