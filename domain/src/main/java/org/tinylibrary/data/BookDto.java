package org.tinylibrary.data;

import java.util.List;

public record BookDto(
    Long id,
    String title,
    String status,
    String remark,
    List<PatronDto> requests
) { }
