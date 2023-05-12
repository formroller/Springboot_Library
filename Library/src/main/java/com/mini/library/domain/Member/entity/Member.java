package com.mini.library.domain.Member.entity;

import com.mini.library.domain.Book.entity.Book;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "bookList")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mid;

    @Column
    private String mname;

    @Column(unique = true)
    private String phone;

    @Column
    private String password;

    @Builder.Default
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    List<Book> bookList = new ArrayList<>();
}
