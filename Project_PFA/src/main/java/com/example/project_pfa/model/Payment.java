package com.example.project_pfa.model;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carteBanquaire;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "infos_commande_id")
    private InfosCommande infosCommande;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCarteBanquaire() { return carteBanquaire; }
    public void setCarteBanquaire(String carteBanquaire) { this.carteBanquaire = carteBanquaire; }
    public InfosCommande getInfosCommande() { return infosCommande; }
    public void setInfosCommande(InfosCommande infosCommande) { this.infosCommande = infosCommande; }
}