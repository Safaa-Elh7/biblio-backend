package com.example.project_pfa.model;

import jakarta.persistence.*;

@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double total;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "article_id")
    private Article livre;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
    public Article getLivre() { return livre; }
    public void setLivre(Article livre) { this.livre = livre; }
}