package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.models.Authors;
import org.example.librarymanagementsystembackend.repo.AuthorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;
    public AuthorsService(AuthorsRepository authorsRepository){
        this.authorsRepository = authorsRepository;
    }

    public List<Authors> getAllAuthors(){
        return authorsRepository.findAll();
    }

    public Authors getAuthorById(int id){
        return authorsRepository.findById(id).orElse(null);
    }

    public Authors addAuthor(Authors author){
        return authorsRepository.save(author);
    }

    public void deleteAuthor(int id){
        authorsRepository.deleteById(id);
    }

    public Authors updateAuthor(int id, Authors author){
        Authors existingAuthor = authorsRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));

        existingAuthor.setAuthorName(author.getAuthorName());

        return authorsRepository.save(existingAuthor);
    }
}
