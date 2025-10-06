package com.example.UberReviewService.models;
import jakarta.persistence.*;

@Entity // it make changes in the java interface
@Table(name = "bookingreview") //table property make changes in the databases only
public class Review {

    @Id //used for declare primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            // Sequence - create a new table
            // Identity - doesn't create any other new table it auto increments.
    Long id;



}
