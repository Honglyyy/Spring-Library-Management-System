package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
