package com.example.bibliobackend.controller;

import com.example.bibliobackend.model.Article;
import com.example.bibliobackend.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Article> getAll() {
        return service.getAllArticles();
    }

    @PostMapping
    public Article create(@RequestBody Article article) {
        return service.createArticle(article);
    }
    @GetMapping("/{id}")
    public Article getById(@PathVariable Long id) {
        return service.getArticleById(id);
    }
    @GetMapping("/auteur/{auteur}")
    public ResponseEntity<?> getByAuteur(@PathVariable String auteur) {
        List<Article> articles = service.getByAuteur(auteur);
        if (articles.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Aucun article trouvé pour l'auteur : " + auteur);
        }
        return ResponseEntity.ok(articles);
    }
    @GetMapping("/search")
    public ResponseEntity<?> searchByTitre(@RequestParam String titre) {
        List<Article> articles = service.searchByTitre(titre);
        if (articles.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Aucun article trouvé avec ce titre.");
        }
        return ResponseEntity.ok(articles);
    }

    @PutMapping("/{id}")
    public Article update(@PathVariable Long id, @RequestBody Article updatedArticle) {
        return service.updateArticle(id, updatedArticle);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteArticle(id);
    }

}
