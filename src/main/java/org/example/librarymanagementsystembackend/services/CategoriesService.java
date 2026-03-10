package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.models.Categories;
import org.example.librarymanagementsystembackend.repo.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;
    public CategoriesService(CategoriesRepository categoriesRepository){
        this.categoriesRepository = categoriesRepository;
    }

    public List<Categories> getAllCategories(){
        return categoriesRepository.findAll();
    }

    public Categories getCategory(int id){
        return categoriesRepository.findById(id).orElse(null);
    }

    public Categories addCategory(Categories categories){
        return categoriesRepository.save(categories);
    }

    public void deleteCategory(int id){
        categoriesRepository.deleteById(id);
    }

    public Categories updateCategory(int id, Categories category){
        Categories existingCategory = categoriesRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not found"));

        existingCategory.setCategory(category.getCategory());

        return categoriesRepository.save(existingCategory);
    }
}
