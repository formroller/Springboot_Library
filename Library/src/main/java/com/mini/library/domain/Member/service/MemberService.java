package com.mini.library.domain.Member.service;

import com.mini.library.domain.Book.entity.Book;
import com.mini.library.domain.Member.dto.MemberDto;
import com.mini.library.domain.Member.entity.Member;

import java.util.ArrayList;

public interface MemberService {
    Long register(MemberDto dto);

    // 회원 개별 조회
    MemberDto get(Long mid);


    // 삭제시 대출 기록 삭제
    void removeWithHistory(Long mid);

    /*직렬화, 역직렬화*/
    //dto to entity
    default Member dtoToEntity(MemberDto dto){
        Member member = Member.builder()
                .mid(dto.getMid())
                .mname(dto.getMname())
                .phone(dto.getPhone())
                .password(dto.getPassword())
                .bookList(dto.getBookList())
                .build();

        return member;
    }

    default MemberDto entityToDto(Member member){
        MemberDto memberDto = MemberDto.builder()
                .mid(member.getMid())
                .mname(member.getMname())
                .phone(member.getPhone())
                .password(member.getPassword())
                .bookList((ArrayList<Book>) member.getBookList())
                .build();

        return memberDto;
    }
}
