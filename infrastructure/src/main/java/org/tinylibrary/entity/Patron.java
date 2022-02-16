package org.tinylibrary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Patron {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "requests")
    private Collection<Book> requestedBooks;
}
