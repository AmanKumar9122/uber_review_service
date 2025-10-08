package com.example.UberReviewService.services;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Driver;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.BookingRepository;
import com.example.UberReviewService.repositories.DriverRepository;
import com.example.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    private DriverRepository driverRepository;
    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository, DriverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Review r = Review.builder()
//                .content("Amazing Ride Quality!")
//                .rating(3.5).build();
//
//        Booking b = Booking
//                .builder()
//                .review(r)
//                .endTime(new Date())
//                .build();
//
//        // reviewRepository.save(r);
//        bookingRepository.save(b);


        // System.out.println("**********************");
        // Review r = Review.builder().content("Amazing Ride!").rating(3.5).build(); // code to create plain object
//        System.out.println(r);
//        reviewRepository.save(r); // this code executes sql query
//        System.out.println(r.getId());
//        List<Review> reviews = reviewRepository.findAll();
//        for(Review review: reviews){
//            System.out.println(r.getContent());
//        }
//       //  Delete booking also deletes the review because of CascadeType.ALL
//        Optional<Booking> b = bookingRepository.findById(1L);
//        if(b.isPresent()){
//            bookingRepository.delete(b.get());
//        }


//        Optional<Driver> driver = driverRepository.findById(1L);
//        if(driver.isPresent()){
//            System.out.println(driver.get().getName());
//            List<Booking> bookings = bookingRepository.findAllByDriverId(1L);
//            for(Booking booking: bookings){
//                System.out.println(booking.getBookingStatus());
//            }
//        }
//
//        Optional<Booking> b = bookingRepository.findById(1L); // eager loading

//        Optional<Driver> d = driverRepository.rawFindByIdAndLicenseNumber(1L, "DL121212" );
//        System.out.println(d.get().getName());

        Optional<Driver> d = driverRepository.hqlFindByIdAndLicence(1L, "DL121212" );
        System.out.println(d.get().getName());
    }
}
