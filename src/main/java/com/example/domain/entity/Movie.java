package com.example.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="movie")
@Getter
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "production_year")
    private Integer productionYear;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    public Movie(String name, int productionYear){
        this.name = name;
        this.productionYear = productionYear;
    }
}
