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
    @NonNull private String status;
    private String remark;
    private List<PatronDto> requests;
}
