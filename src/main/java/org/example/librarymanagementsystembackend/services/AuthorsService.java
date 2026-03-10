package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.AuthorsRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;
    public AuthorsService(AuthorsRepository authorsRepository){
        this.authorsRepository = authorsRepository;
    }
}
