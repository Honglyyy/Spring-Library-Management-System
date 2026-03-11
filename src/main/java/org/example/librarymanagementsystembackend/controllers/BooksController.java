package org.example.librarymanagementsystembackend.controllers;

import org.example.librarymanagementsystembackend.models.Books;
import org.example.librarymanagementsystembackend.services.BooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {
    private final BooksService booksService;
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Books>> getAllBooks(){
        return new ResponseEntity<>(booksService.getAllBooks(), HttpStatus.OK);
    }

    @PostMapping("/books")
    public ResponseEntity<Books> addBook(@RequestBody Books book){
        return new ResponseEntity<>(booksService.addBook(book),HttpStatus.OK);
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Books> addBook(
            @PathVariable int id,
            @RequestBody Books book
    ){
        return new ResponseEntity<>(booksService.updateBook(id,book),HttpStatus.OK);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        booksService.deleteBook(id);
        return new ResponseEntity<>("Book id " + id + " is now deleted!!", HttpStatus.OK);
    }
}
