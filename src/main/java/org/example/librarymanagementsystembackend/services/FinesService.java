package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.FinesRepository;
import org.springframework.stereotype.Service;

@Service
public class FinesService {
    private final FinesRepository finesRepository;
    public FinesService(FinesRepository finesRepository){
        this.finesRepository = finesRepository;
    }
}
