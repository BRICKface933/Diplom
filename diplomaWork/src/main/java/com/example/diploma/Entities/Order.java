package com.example.diploma.Entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "order")
public class Order {
    @Id
    @Column(nullable = false)
    private Long id;
    private Integer final_sum; //--body once told me
    private Car car;
    private Employee employee;
    private Set<JobCategory> job_category;
}
