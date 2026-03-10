package org.example.librarymanagementsystembackend.services;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersService usersService;
    public UsersService(UsersService usersService) {
        this.usersService = usersService;
    }

}
