package org.tinylibrary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String status;
    private String remark;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "requests",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "patron_id")
    )
    private Collection<Patron> requests;
}
