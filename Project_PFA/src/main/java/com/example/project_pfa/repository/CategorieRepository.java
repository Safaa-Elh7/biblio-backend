package com.example.project_pfa.repository;

import com.example.project_pfa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Category, Long> {
}
