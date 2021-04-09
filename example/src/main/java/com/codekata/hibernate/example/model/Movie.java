package com.codekata.hibernate.example.model;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Where(clause = "mov_dt_rel<'1989-01-01'")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mov_id")
    private Integer id;

    @Column(name = "mov_title")
    private String title;

    @Column(name = "mov_year")
    private Integer year;

    @Column(name = "mov_time")
    private Integer time;

    @Column(name = "mov_lang")
    private String language;

    @Column(name = "mov_dt_rel")
    private LocalDate releaseDate;

    @Column(name = "mov_rel_country")
    private String country;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "movie_direction",
            joinColumns = @JoinColumn(name = "mov_id"),
            inverseJoinColumns = @JoinColumn(name = "dir_id"))
    private List<Director> directors;
}
