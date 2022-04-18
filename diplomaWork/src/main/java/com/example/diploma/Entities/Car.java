package com.example.diploma.Entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String license_plate;

    @Column(nullable = false)
    private String car_brand;

    @Column(nullable = false)
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "model")
    private String model;

    @Column(nullable = false)
    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    private Set<Order> order_id;
}
