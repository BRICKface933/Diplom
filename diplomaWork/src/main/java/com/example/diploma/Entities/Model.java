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
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String model_name;

//    @Column(nullable = false) - Дерьмо навязанное разработчиком
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand")
    private CarBrand brand;

//    @OneToMany(mappedBy = "model",fetch = FetchType.LAZY)
//    private Set<Model> car_list;
}
