package com.example.project_pfa.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Retour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateRetourRelle;
    private String etatLivre;
    private Boolean payback;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employe_id")
    private Employe employe;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "emprunt_id")
    private Emprunt emprunt;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getDateRetourRelle() { return dateRetourRelle; }
    public void setDateRetourRelle(LocalDate dateRetourRelle) { this.dateRetourRelle = dateRetourRelle; }
    public String getEtatLivre() { return etatLivre; }
    public void setEtatLivre(String etatLivre) { this.etatLivre = etatLivre; }
    public Boolean getPayback() { return payback; }
    public void setPayback(Boolean payback) { this.payback = payback; }
    public Employe getEmploye() { return employe; }
    public void setEmploye(Employe employe) { this.employe = employe; }
    public Emprunt getEmprunt() { return emprunt; }
    public void setEmprunt(Emprunt emprunt) { this.emprunt = emprunt; }
}