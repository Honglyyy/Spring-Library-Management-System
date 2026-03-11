package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.models.Authors;
import org.example.librarymanagementsystembackend.models.Books;
import org.example.librarymanagementsystembackend.models.Categories;
import org.example.librarymanagementsystembackend.repo.AuthorsRepository;
import org.example.librarymanagementsystembackend.repo.BooksRepository;
import org.example.librarymanagementsystembackend.repo.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private final BooksRepository booksRepository;
    private final AuthorsRepository authorsRepository;
    private final CategoriesRepository categoriesRepository;

    public BooksService(BooksRepository booksRepository, AuthorsRepository authorsRepository, CategoriesRepository categoriesRepository) {
        this.booksRepository = booksRepository;
        this.authorsRepository = authorsRepository;
        this.categoriesRepository = categoriesRepository;
    }



    public List<Books> getAllBooks(){
        return booksRepository.findAll();
    }

    public Books getBook(int id){
        return booksRepository.findById(id).orElse(null);
    }

    public Books addBook(Books book){
        List<Authors> authors = authorsRepository.findAllById(
                book.getAuthors()
                        .stream()
                        .map(author -> author.getAuthorId())
                        .toList()
        );

        List<Categories> categories = categoriesRepository.findAllById(
                book.getCategories()
                        .stream()
                        .map(category -> category.getCategoryId())
                        .toList()
        );

        book.setAuthors(authors);
        book.setCategories(categories);

        return booksRepository.save(book);
    }

    public Books updateBook(int id, Books book){
        Books existingBook = booksRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found!!!"));

        existingBook.setBookTitle(book.getBookTitle());
        existingBook.setPages(book.getPages());
        existingBook.setBookCoverDir(book.getBookCoverDir());
        existingBook.setPublishedYear(book.getPublishedYear());
        existingBook.setIsbn(book.getIsbn());
        existingBook.setDescription(book.getDescription());
        existingBook.setQuantity(book.getQuantity());

        existingBook.setAuthors(book.getAuthors());
        existingBook.setCategories(book.getCategories());

        return booksRepository.save(existingBook);

    }

    public void deleteBook(int id){
        booksRepository.deleteById(id);
    }
}
