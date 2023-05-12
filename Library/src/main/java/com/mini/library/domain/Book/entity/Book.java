package com.mini.library.domain.Book.entity;

import com.mini.library.domain.History.History;
import com.mini.library.domain.Member.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = {"member","bookHistoryList"})
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bid;

    private String bname;

    private String author;

    private String publisher;

    private boolean lend;

    @ManyToOne
    private Member member;

    @Builder.Default
    @OneToMany(mappedBy = "book")
    private List<History> bookHistoryList = new ArrayList<>();

}
