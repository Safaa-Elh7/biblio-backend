package com.example.project_pfa.model;

import jakarta.persistence.*;

@Entity
public class InfosCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double totalComplet;

    @Column(name = "total_avec_avance")
    private Double totalAvecAvance;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "emprunt_id")
    private Emprunt emprunt;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Double getTotalComplet() { return totalComplet; }
    public void setTotalComplet(Double totalComplet) { this.totalComplet = totalComplet; }
    public Double getTotalAvecAvance() { return totalAvecAvance; }
    public void setTotalAvecAvance(Double totalAvecAvance) { this.totalAvecAvance = totalAvecAvance; }
    public Emprunt getEmprunt() { return emprunt; }
    public void setEmprunt(Emprunt emprunt) { this.emprunt = emprunt; }
}