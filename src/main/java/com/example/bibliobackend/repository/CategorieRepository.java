package com.example.bibliobackend.repository;

import com.example.bibliobackend.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    List<Categorie> findByTypeNomContainingIgnoreCase(String typeNom);

}
