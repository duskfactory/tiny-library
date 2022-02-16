package org.tinylibrary.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate lendingDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lender_id")
    private Patron lender;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;
}
