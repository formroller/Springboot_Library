package com.mini.library.member.service;

import com.mini.library.domain.Member.dto.MemberDto;
import com.mini.library.domain.Member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTests {
    @Autowired
    private MemberService service;

    @Test
    public void testRegister(){
        MemberDto dto = MemberDto.builder()
                .mid(1L)
                .mname("김춘삼")
                .phone("010-1112-2221")
                .password("1111")
                .build();

        Long mid = service.register(dto);
        System.out.println("=".repeat(15)+"mid : "+mid+"=".repeat(15));
    }
}
