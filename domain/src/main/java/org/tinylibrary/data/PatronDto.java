package org.tinylibrary.data;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatronDto {
    @NonNull private Long id;
    @NonNull private String name;
}
