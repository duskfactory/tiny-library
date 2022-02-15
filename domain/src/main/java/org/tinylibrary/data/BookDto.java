package org.tinylibrary.data;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    @NonNull private Long id;
    @NonNull private String title;
    @NonNull private Status status;
    private String remark;
    private List<PatronDto> requests;

    public enum Status {
        Available,
        ToOrder,
        Lent
    }
}
