package com.mini.library.domain.Member.dto;

import com.mini.library.domain.Book.entity.Book;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private Long mid;

    private String mname;

    private String phone;

    private String password;

    private ArrayList<Book> bookList; // 책 제목

    private LocalDateTime lendDate, returnDate; // 대여일자, 반납일자




}
