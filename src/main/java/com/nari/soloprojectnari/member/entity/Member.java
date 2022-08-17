package com.nari.soloprojectnari.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false, updatable = false)
    private String password;

    @Column(length = 10, nullable = false)
    private String sex;

    @Column(length = 100, nullable = false)
    private String companyName;

//    @OneToMany(mappedBy = "member")
    private long companyType;

//    @OneToMany(mappedBy = "member")
    private long companyLocation;

    public Member(String name, long companyType, long companyLocation) {
        this.name = name;
        this.companyType = companyType;
        this.companyLocation = companyLocation;
    }
}