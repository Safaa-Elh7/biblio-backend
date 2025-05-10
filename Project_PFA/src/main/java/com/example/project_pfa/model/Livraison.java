package com.example.project_pfa.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateLivraison;
    private String statutLivraison;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "infos_commande_id")
    private InfosCommande infosCommande;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getDateLivraison() { return dateLivraison; }
    public void setDateLivraison(LocalDate dateLivraison) { this.dateLivraison = dateLivraison; }
    public String getStatutLivraison() { return statutLivraison; }
    public void setStatutLivraison(String statutLivraison) { this.statutLivraison = statutLivraison; }
    public InfosCommande getInfosCommande() { return infosCommande; }
    public void setInfosCommande(InfosCommande infosCommande) { this.infosCommande = infosCommande; }
}