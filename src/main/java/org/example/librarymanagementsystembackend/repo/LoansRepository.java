package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

interface LoansRepository extends JpaRepository<Loans, Integer> {
}
