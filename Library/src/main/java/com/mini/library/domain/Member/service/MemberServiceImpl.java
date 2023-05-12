package com.mini.library.domain.Member.service;

import com.mini.library.domain.Member.dto.MemberDto;
import com.mini.library.domain.Member.entity.Member;
import com.mini.library.domain.Member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class MemberServiceImpl implements MemberService{

    private final MemberRepository repository;


    @Override
    public Long register(MemberDto dto) {
        log.info(dto);
        Member member = dtoToEntity(dto);

        repository.save(member);

        return member.getMid();
    }

    @Override
    public MemberDto get(Long mid) {
        return null;
    }

    @Override
    public void removeWithHistory(Long mid) {

    }
}
