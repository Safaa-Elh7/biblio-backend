package com.example.bibliobackend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_emprunt;

    private LocalDateTime date_emprunt;
    private LocalDateTime date_retour_prevue;
    private String etat;
    private Double total;
    private Integer nb_renouvellements;



    @Column(updatable = false)
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    @PrePersist
    protected void onCreate() {
        created_at = updated_at = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updated_at = LocalDateTime.now();
    }
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "id_panier")
    private Panier panier;
    // Getters & Setters
}
