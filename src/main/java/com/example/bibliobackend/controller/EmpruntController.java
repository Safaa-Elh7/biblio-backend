package com.example.bibliobackend.controller;

import com.example.bibliobackend.model.Emprunt;
import com.example.bibliobackend.service.EmpruntService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprunts")
public class EmpruntController {

    private final EmpruntService service;

    public EmpruntController(EmpruntService service) {
        this.service = service;
    }

    @GetMapping
    public List<Emprunt> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        return service.getById(id)
                .<ResponseEntity<Object>>map(emp -> ResponseEntity.ok(emp))
                .orElse(ResponseEntity.status(404).body("Emprunt non trouvé"));
    }
    @GetMapping("/etat/{etat}")
    public List<Emprunt> getByEtat(@PathVariable String etat) {
        return service.getByEtat(etat);
    }
    @PostMapping
    public Emprunt create(@RequestBody Emprunt emprunt) {
        return service.create(emprunt);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Emprunt updated) {
        try {
            return ResponseEntity.ok(service.update(id, updated));
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok("Supprimé avec succès");
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}
