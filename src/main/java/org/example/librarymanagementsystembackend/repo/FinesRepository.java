package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Fines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinesRepository extends JpaRepository<Fines, Integer> {
}
