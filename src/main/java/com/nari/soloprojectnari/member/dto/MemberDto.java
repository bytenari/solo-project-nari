package com.nari.soloprojectnari.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class MemberDto {

    @AllArgsConstructor
    @Getter
    public static class Response {
        private long memberId;
        private String name;
        private String password;
        private String sex;
        private String companyName;
        private int companyType;
        private int companyLocation;
    }
}