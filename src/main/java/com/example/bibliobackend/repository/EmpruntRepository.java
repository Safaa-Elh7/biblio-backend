package com.example.bibliobackend.repository;

import com.example.bibliobackend.model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
    List<Emprunt> findByEtat(String etat);

}
