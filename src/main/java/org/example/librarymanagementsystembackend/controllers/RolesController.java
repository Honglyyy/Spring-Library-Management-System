package org.example.librarymanagementsystembackend.controllers;

import org.example.librarymanagementsystembackend.models.Roles;
import org.example.librarymanagementsystembackend.services.RolesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolesController {
    private final RolesService rolesService;
    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping("/roles")
    public ResponseEntity<List<Roles>> getRoles(){
        List<Roles> roles = rolesService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
    @GetMapping("/roles/{id}")
    public ResponseEntity<Roles> getRoleById(@PathVariable int id){
        return new ResponseEntity<>(rolesService.getRoleById(id),HttpStatus.OK);
    }
}
