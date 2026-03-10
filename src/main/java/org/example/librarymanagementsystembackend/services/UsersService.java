package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.models.Users;
import org.example.librarymanagementsystembackend.repo.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public Users getUserById(int id){
        return usersRepository.findById(id).orElse(null);
    }

    public Users addUser(Users user){
        return usersRepository.save(user);
    }

    public void deleteUser(int id){
        usersRepository.deleteById(id);
    }

    public Users updateUser(int id, Users user){
        Users existingUser = usersRepository.findById(id)
                                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        existingUser.setRole(user.getRole());

        return usersRepository.save(existingUser);
    }
}
