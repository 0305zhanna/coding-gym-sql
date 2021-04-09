package com.codekata.hibernate.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dir_id")
    private Integer id;

    @Column(name = "dir_fname")
    private String firstName;

    @Column(name = "dir_lname")
    private String lastName;
}
