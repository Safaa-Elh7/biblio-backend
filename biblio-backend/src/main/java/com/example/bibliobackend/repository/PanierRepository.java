package com.example.bibliobackend.repository;

import com.example.bibliobackend.model.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierRepository extends JpaRepository<Panier, Long> {
}
