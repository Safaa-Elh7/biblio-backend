package com.example.bibliobackend.controller;

import com.example.bibliobackend.model.Categorie;
import com.example.bibliobackend.service.CategorieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    private final CategorieService service;

    public CategorieController(CategorieService service) {
        this.service = service;
    }

    @GetMapping
    public List<Categorie> getAll() {
        return service.getAllCategories();
    }

    @GetMapping("/{id}")
    public Categorie getById(@PathVariable Long id) {
        return service.getCategorieById(id);
    }

    @PostMapping
    public Categorie create(@RequestBody Categorie categorie) {
        return service.createCategorie(categorie);
    }
    @GetMapping("/search")
    public ResponseEntity<?> searchByTypeNom(@RequestParam String typeNom) {
        List<Categorie> categories = service.searchByTypeNom(typeNom);
        if (categories.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Aucune catégorie trouvée avec ce typeNom.");
        }
        return ResponseEntity.ok(categories);
    }


    @PutMapping("/{id}")
    public Categorie update(@PathVariable Long id, @RequestBody Categorie categorie) {
        return service.updateCategorie(id, categorie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteCategorie(id);
    }
}
