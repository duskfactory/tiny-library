package org.tinylibrary.data;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanDto {
    @NonNull private Long id;
    @NonNull private LocalDate lendingDate;
    @NonNull private PatronDto lender;
    @NonNull private BookDto book;
}
