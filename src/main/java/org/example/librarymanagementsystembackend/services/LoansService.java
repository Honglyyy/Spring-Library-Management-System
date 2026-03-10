package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.LoansRepository;
import org.springframework.stereotype.Service;

@Service
public class LoansService {
    private final LoansRepository loansRepository;
    public LoansService(LoansRepository loansRepository){
        this.loansRepository = loansRepository;
    }
}
