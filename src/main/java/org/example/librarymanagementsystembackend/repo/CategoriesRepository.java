package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
