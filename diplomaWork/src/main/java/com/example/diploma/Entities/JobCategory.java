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
@Table(name = "job_category")
public class JobCategory {
    @Id
    @Column(nullable = false)
    private Long id;
    private String job_name;
    private Integer job_cost;
}
