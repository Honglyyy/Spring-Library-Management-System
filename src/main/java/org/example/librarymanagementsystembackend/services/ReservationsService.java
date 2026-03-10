package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.ReservationsRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationsService {
    private final ReservationsRepository reservationsRepository;
    public ReservationsService(ReservationsRepository reservationsRepository){
        this.reservationsRepository = reservationsRepository;
    }
}
