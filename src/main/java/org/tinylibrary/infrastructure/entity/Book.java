package org.tinylibrary.infrastructure.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "varchar(255) default 'Available'")
    private String status;
    private String remark;
}
