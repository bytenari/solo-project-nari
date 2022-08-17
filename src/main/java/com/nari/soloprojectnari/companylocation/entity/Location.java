package com.nari.soloprojectnari.companylocation.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ManyToOne
//    @JoinColumn(name = "COMPANY_LOCATION")
    private Long locationId;
    @Column(length = 100, nullable = false)
    private String locationName;
}
