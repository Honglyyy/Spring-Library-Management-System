package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

interface AuthorsRepository extends JpaRepository<Authors, Integer> {
}
