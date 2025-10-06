package com.example.UberReviewService.services;

import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************");
        Review r = Review.builder().content("Great ride!").createdAt(new Date()).updatedAt(new Date()).rating(4.5).build(); // code to create plain object
        System.out.println(r);
        reviewRepository.save(r); // this code executes sql query
    }
}
