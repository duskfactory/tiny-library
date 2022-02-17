package org.tinylibrary.data;

public record BookDto(
    Long id,
    String title,
    String status,
    String remark
) { }
