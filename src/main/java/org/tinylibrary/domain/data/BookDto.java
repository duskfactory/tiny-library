package org.tinylibrary.domain.data;

public record BookDto(
    Long id,
    String title,
    String status,
    String remark
) { }
