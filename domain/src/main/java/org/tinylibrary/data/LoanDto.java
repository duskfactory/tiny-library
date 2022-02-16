package org.tinylibrary.data;

import java.time.LocalDate;

public record LoanDto(
        Long id,
        LocalDate lendingDate,
        PatronDto lender,
        BookDto book
) { }
