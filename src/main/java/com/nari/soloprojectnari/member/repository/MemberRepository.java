package com.nari.soloprojectnari.member.repository;


import com.nari.soloprojectnari.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByTypeLocation(long type, long location);
}