package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
}
