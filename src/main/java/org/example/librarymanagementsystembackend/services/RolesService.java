package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.RolesRepository;
import org.springframework.stereotype.Service;

@Service
public class RolesService {
    private final RolesRepository rolesRepository;
    public RolesService(RolesRepository rolesRepository){
        this.rolesRepository = rolesRepository;
     }
}
