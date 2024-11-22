package com.example.demo.eleve.dao;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "eleve")
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @Column(unique = true)
    private String email;

    private Integer age;

    private String classe;

    @Column(name = "date_inscription")
    private LocalDate dateInscription;

    private String statut;




}
