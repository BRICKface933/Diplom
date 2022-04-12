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
@Table(name = "autoservice")
public class Autoservice {
    @Id
    @Column(nullable = false)
    private Long as_id;
    private Set<Order> order;
    private String Adress;
}
