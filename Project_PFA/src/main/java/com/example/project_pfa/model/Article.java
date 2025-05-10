package com.example.project_pfa.model;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String acteur;
    private Integer anneePub;
    private Integer qte;
    private Double prixEmprunt;
    private String isbn;
    private String editeur;
    private String langue;

    @Lob
    private String motsCles;
    private String typeArticle;
    private String fichierUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public String getActeur() { return acteur; }
    public void setActeur(String acteur) { this.acteur = acteur; }
    public Integer getAnneePub() { return anneePub; }
    public void setAnneePub(Integer anneePub) { this.anneePub = anneePub; }
    public Integer getQte() { return qte; }
    public void setQte(Integer qte) { this.qte = qte; }
    public Double getPrixEmprunt() { return prixEmprunt; }
    public void setPrixEmprunt(Double prixEmprunt) { this.prixEmprunt = prixEmprunt; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getEditeur() { return editeur; }
    public void setEditeur(String editeur) { this.editeur = editeur; }
    public String getLangue() { return langue; }
    public void setLangue(String langue) { this.langue = langue; }
    public String getMotsCles() { return motsCles; }
    public void setMotsCles(String motsCles) { this.motsCles = motsCles; }
    public String getTypeArticle() { return typeArticle; }
    public void setTypeArticle(String typeArticle) { this.typeArticle = typeArticle; }
    public String getFichierUrl() { return fichierUrl; }
    public void setFichierUrl(String fichierUrl) { this.fichierUrl = fichierUrl; }
    public Category getCategorie() { return category; }
    public void setCategorie(Category category) { this.category = category; }
}