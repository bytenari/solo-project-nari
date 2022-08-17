package com.nari.soloprojectnari.member.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemberResponseDto {
    private long memberId;
    private String name;
    private String password;
    private String sex;
    private String companyName;
    private int companyType;
    private int companyLocation;
}
