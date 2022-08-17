package com.nari.soloprojectnari.member.service;

import com.nari.soloprojectnari.exception.BusinessLogicException;
import com.nari.soloprojectnari.exception.ExceptionCode;
import com.nari.soloprojectnari.member.entity.Member;
import com.nari.soloprojectnari.member.repository.MemberRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member findMember(long type, long location) {
        return findVerifiedMember(type, location);
    }

    public Page<Member> findMembers(int page, int size) {
        return memberRepository.findAll(PageRequest.of(page, size,
                Sort.by("memberId").descending()));
    }

    public Member findVerifiedMember(long type, long location) {
        Optional<Member> optionalMember =
                memberRepository.findByTypeLocation(type, location);
        Member findMember =
                optionalMember.orElseThrow(() ->
                        new BusinessLogicException(ExceptionCode.MEMBER_NOT_FOUND));

        return findMember;
    }

}

