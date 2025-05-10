package com.example.bibliobackend.repository;

import com.example.bibliobackend.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByAuteur(String auteur);
}
