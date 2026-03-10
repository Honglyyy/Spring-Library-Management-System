package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.CategoriesRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;
    public CategoriesService(CategoriesRepository categoriesRepository){
        this.categoriesRepository = categoriesRepository;
    }
}
