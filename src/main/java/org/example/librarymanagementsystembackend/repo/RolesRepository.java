package org.example.librarymanagementsystembackend.repo;

import org.example.librarymanagementsystembackend.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

interface RolesRepository extends JpaRepository<Roles, Integer> {
}
