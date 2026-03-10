package org.example.librarymanagementsystembackend.controllers;

import org.example.librarymanagementsystembackend.models.Authors;
import org.example.librarymanagementsystembackend.services.AuthorsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorsController {
    private final AuthorsService authorsService;
    public AuthorsController(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @GetMapping("/authors")
    public ResponseEntity<List<Authors>> getAllAuthors(){
        return new ResponseEntity<>(authorsService.getAllAuthors(), HttpStatus.OK);
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Authors> getAuthor(@PathVariable int id){
        return new ResponseEntity<>(authorsService.getAuthorById(id),HttpStatus.OK);
    }

    @PostMapping("/authors")
    public ResponseEntity<Authors> addAuthor(@RequestBody Authors author){
        return new ResponseEntity<>(authorsService.addAuthor(author), HttpStatus.OK);
    }

    @DeleteMapping("/authors/{id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable int id){
        authorsService.deleteAuthor(id);
        return new ResponseEntity<>("Author id " + id + " is deleted!!", HttpStatus.OK);
    }

    @PutMapping("/authors/{id}")
    public ResponseEntity<?> updateAuthor(
            @PathVariable int id,
            @RequestBody Authors author
    )
    {
        return new ResponseEntity<>(authorsService.updateAuthor(id,author), HttpStatus.OK);
    }
}
