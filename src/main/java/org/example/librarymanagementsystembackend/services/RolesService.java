package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.models.Roles;
import org.example.librarymanagementsystembackend.repo.RolesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService {
    private final RolesRepository rolesRepository;
    public RolesService(RolesRepository rolesRepository){
        this.rolesRepository = rolesRepository;
     }

    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    public Roles getRoleById(int id){
        return rolesRepository.findById(id).orElse(null);
    }
}
