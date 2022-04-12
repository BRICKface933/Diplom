package com.example.diploma.Entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String second_name;
    @Column(nullable = false)
    private String middle_name;
    @Column(nullable = false, unique = true)
    private Integer emp_phone;
}
