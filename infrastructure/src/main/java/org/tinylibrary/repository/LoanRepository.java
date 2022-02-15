package org.tinylibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tinylibrary.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
