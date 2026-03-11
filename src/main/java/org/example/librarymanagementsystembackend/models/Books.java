package org.example.librarymanagementsystembackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "pages")
    private int pages;

    @Column(name = "book_cover_dir")
    private String bookCoverDir;

    @Column(name = "published_year")
    private int publishedYear;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private double quantity;

    @ManyToMany
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Authors> authors;

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Categories> categories;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<Reviews> reviews;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<Reservations> reservations;

    @ManyToMany(mappedBy = "books")
    @JsonIgnore
    private List<Loans> loans;
}
