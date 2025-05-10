package com.example.bibliobackend.service;

import com.example.bibliobackend.exception.ResourceNotFoundException;
import com.example.bibliobackend.model.Article;
import com.example.bibliobackend.model.Categorie;
import com.example.bibliobackend.repository.ArticleRepository;
import com.example.bibliobackend.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository repository;
    private final CategorieRepository categorieRepository;

    public ArticleService(ArticleRepository repository,CategorieRepository categorieRepository) {
        this.repository = repository;
        this.categorieRepository = categorieRepository;
    }

    public List<Article> getAllArticles() {
        return repository.findAll();
    }

    public Article createArticle(Article article) {
        if (article.getCategorie() != null && article.getCategorie().getId_categorie() != null) {
            Categorie fullCategorie = categorieRepository.findById(article.getCategorie().getId_categorie())
                    .orElseThrow(() -> new RuntimeException("Catégorie non trouvée"));

            article.setCategorie(fullCategorie);
        }
        return repository.save(article);
    }
    public Article getArticleById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Article with id " + id + " not found"));

    }
    public List<Article> getByAuteur(String auteur) {
        return repository.findByAuteur(auteur);
    }
    public Article updateArticle(Long id, Article updatedArticle) {
        Article article = getArticleById(id);
        article.setTitre(updatedArticle.getTitre());
        article.setAnnee_pub(updatedArticle.getAnnee_pub());
        article.setQte(updatedArticle.getQte());
        article.setPrix_emprunt(updatedArticle.getPrix_emprunt());
        article.setLangue(updatedArticle.getLangue());
        article.setDescription(updatedArticle.getDescription());
        article.setAuteur(updatedArticle.getAuteur());
        article.setCategorie(updatedArticle.getCategorie());
        article.setUpdated_at(LocalDateTime.now());
        return repository.save(article);
    }
    public void deleteArticle(Long id) {
        repository.deleteById(id);
    }
}
