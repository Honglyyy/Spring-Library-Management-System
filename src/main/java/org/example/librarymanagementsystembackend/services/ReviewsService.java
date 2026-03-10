package org.example.librarymanagementsystembackend.services;

import org.example.librarymanagementsystembackend.repo.ReviewsRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {
    private final ReviewsRepository reviewsRepository;
    public ReviewsService(ReviewsRepository reviewsRepository){
        this.reviewsRepository = reviewsRepository;
    }
}
