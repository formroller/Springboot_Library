package com.mini.library.domain.Library.entity;

import com.mini.library.domain.History.History;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString(exclude = "libraryHistoryList")
public class Library {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;

    private String lname;

    @Builder.Default
    @OneToMany(mappedBy="library")
    private List<History> libraryHistoryList = new ArrayList<>();

}
