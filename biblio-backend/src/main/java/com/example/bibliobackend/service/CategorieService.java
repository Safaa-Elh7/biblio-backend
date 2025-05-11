package com.example.bibliobackend.service;

import com.example.bibliobackend.exception.ResourceNotFoundException;
import com.example.bibliobackend.model.Categorie;
import com.example.bibliobackend.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    private final CategorieRepository repository;

    public CategorieService(CategorieRepository repository) {
        this.repository = repository;
    }

    public List<Categorie> getAllCategories() {
        return repository.findAll();
    }

    public Categorie getCategorieById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Catégorie avec ID " + id + " non trouvée."));
    }


    public Categorie createCategorie(Categorie categorie) {
        return repository.save(categorie);
    }

    public Categorie updateCategorie(Long id, Categorie updatedCategorie) {
        Categorie existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Catégorie avec ID " + id + " non trouvée."));
        existing.setDescription(updatedCategorie.getDescription());
        existing.setTypeNom(updatedCategorie.getTypeNom());
        return repository.save(existing);
    }
    public List<Categorie> searchByTypeNom(String typeNom) {
        return repository.findByTypeNomContainingIgnoreCase(typeNom);
    }


    public void deleteCategorie(Long id) {
        repository.deleteById(id);
    }
}
