package com.example.project_pfa.model;

import jakarta.persistence.*;

@Entity
public class Amende {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double montant;

    @Lob
    private String raison;
    private Boolean payee;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "retour_id")
    private Retour retour;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Double getMontant() { return montant; }
    public void setMontant(Double montant) { this.montant = montant; }
    public String getRaison() { return raison; }
    public void setRaison(String raison) { this.raison = raison; }
    public Boolean getPayee() { return payee; }
    public void setPayee(Boolean payee) { this.payee = payee; }
    public Retour getRetour() { return retour; }
    public void setRetour(Retour retour) { this.retour = retour; }
}