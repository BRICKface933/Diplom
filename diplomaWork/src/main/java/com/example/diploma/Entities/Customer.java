package com.example.diploma.Entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customer")
public class Customer {
    @Id
    @Column(nullable = false)
    private Long id;
    private String cus_first_name;
    private String cus_second_name;
    private String cus_middle_name;
    private Integer cus_phone;
}
