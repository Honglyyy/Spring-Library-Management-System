package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.BooksRepository;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
    private final BooksRepository booksRepository;
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }
}
