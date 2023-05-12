package com.mini.library.domain.History;

import com.mini.library.domain.Book.entity.Book;
import com.mini.library.domain.Library.entity.Library;
import com.mini.library.global.auditable.Auditable;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString(exclude = {"book","library"})
public class History extends Auditable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hid;

    @ManyToOne
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "LIBRARY_ID")
    private Library library;

}
