package com.codekata.hibernate.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class MovieCast {

    @Column(name = "act_id")
    private Integer actorId;

    @Column(name = "mov_id")
    private Integer movieId;

    @Column(name = "role")
    private String role;

    @ManyToOne
    @JoinColumn(name = "mov_id")
    private Movie movie;
}
