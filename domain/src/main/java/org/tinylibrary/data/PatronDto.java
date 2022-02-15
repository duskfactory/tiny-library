package org.tinylibrary.data;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatronDto {
    @NonNull private Long id;
    @NonNull private String name;
    private List<BookDto> requestedBooks;
}
