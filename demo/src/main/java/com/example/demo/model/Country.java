package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="countries")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int population;

}
