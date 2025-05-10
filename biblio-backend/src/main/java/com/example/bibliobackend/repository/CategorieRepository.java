package com.example.bibliobackend.repository;

import com.example.bibliobackend.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
