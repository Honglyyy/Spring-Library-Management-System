package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
