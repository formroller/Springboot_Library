package com.mini.library.domain.Member.repository;

import com.mini.library.domain.Member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
