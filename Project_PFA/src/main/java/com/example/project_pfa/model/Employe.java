package com.example.project_pfa.model;

import jakarta.persistence.*;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Personne personne;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Compte compte;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Personne getPersonne() { return personne; }
    public void setPersonne(Personne personne) { this.personne = personne; }
    public Compte getCompte() { return compte; }
    public void setCompte(Compte compte) { this.compte = compte; }
}