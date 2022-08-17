package com.nari.soloprojectnari.companytype.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ManyToOne
//    @JoinColumn(name = "COMPANY_TYPE")
    private Long typeId;
    @Column(length = 100, nullable = false)
    private String typeName;
}
