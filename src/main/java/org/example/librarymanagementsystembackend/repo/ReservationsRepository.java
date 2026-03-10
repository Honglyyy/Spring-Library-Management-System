package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

interface ReservationsRepository extends JpaRepository<Reservations, Integer> {
}
