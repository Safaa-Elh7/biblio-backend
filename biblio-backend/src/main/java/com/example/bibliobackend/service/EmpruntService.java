package com.example.bibliobackend.service;

import com.example.bibliobackend.model.Article;
import com.example.bibliobackend.model.Client;
import com.example.bibliobackend.model.Emprunt;
import com.example.bibliobackend.model.Panier;
import com.example.bibliobackend.repository.ArticleRepository;
import com.example.bibliobackend.repository.ClientRepository;
import com.example.bibliobackend.repository.EmpruntRepository;
import com.example.bibliobackend.repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpruntService {
    @Autowired
    private ArticleRepository articleRepo;
    @Autowired
    private ClientRepository clientRepo;
    @Autowired
    private PanierRepository panierRepo;
    private final EmpruntRepository repository;

    public EmpruntService(EmpruntRepository repository) {
        this.repository = repository;
    }

    public List<Emprunt> getAll() {
        return repository.findAll();
    }

    public Optional<Emprunt> getById(Long id) {
        return repository.findById(id);
    }



    public Emprunt create(Emprunt emprunt) {
        Article article = articleRepo.findById(emprunt.getArticle().getId_article())
                .orElseThrow(() -> new RuntimeException("Article introuvable"));
        Client client = clientRepo.findById(emprunt.getClient().getId_client())
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
        Panier panier = panierRepo.findById(emprunt.getPanier().getId_panier())
                .orElseThrow(() -> new RuntimeException("Panier introuvable"));

        emprunt.setArticle(article);
        emprunt.setClient(client);
        emprunt.setPanier(panier);

        return repository.save(emprunt);
    }

    public Emprunt update(Long id, Emprunt updated) {
        return repository.findById(id).map(emp -> {
            emp.setEtat(updated.getEtat());
            emp.setDate_retour_prevue(updated.getDate_retour_prevue());
            emp.setNb_renouvellements(updated.getNb_renouvellements());
            return repository.save(emp);
        }).orElseThrow(() -> new RuntimeException("Emprunt avec l'ID " + id + " non trouvé."));
    }


    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Emprunt avec l'ID " + id + " non trouvé.");
        }
        repository.deleteById(id);
    }
    public List<Emprunt> getByEtat(String etat) {
        return repository.findByEtat(etat);
    }
}
