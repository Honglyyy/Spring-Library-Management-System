package org.example.librarymanagementsystembackend.controllers;

import org.example.librarymanagementsystembackend.models.Categories;
import org.example.librarymanagementsystembackend.services.CategoriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {
    private final CategoriesService categoriesService;
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Categories>> getAllCategories(){
        return new ResponseEntity<>(categoriesService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Categories> getCategory(@PathVariable int id) {
        return new ResponseEntity<>(categoriesService.getCategory(id), HttpStatus.OK);
    }

    @PostMapping("/categories")
    public ResponseEntity<?> addCategory(@RequestBody Categories categories) {
        return new ResponseEntity<>(categoriesService.addCategory(categories), HttpStatus.OK);
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable int id){
        categoriesService.deleteCategory(id);
        return new ResponseEntity<>("Category id " + id +" as been deleted!!",HttpStatus.OK);
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<?> updateCategory(
            @PathVariable int id,
            @RequestBody Categories category
    ){
        try{
            return new ResponseEntity<>(categoriesService.updateCategory(id,category),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
        }
    }
}
