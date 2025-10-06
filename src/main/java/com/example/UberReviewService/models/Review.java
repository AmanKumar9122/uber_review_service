package com.example.UberReviewService.models;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity // it is used to declare a class as an entity and map it to a database table
@Table(name = "bookingreview") // it make changes in the database table name
public class Review {

    @Id //used for declare primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            // Sequence - it creates a new table in the database and auto increments the id
            // Identity - it auto increments the id
    Long id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //this annotation tells spring about the format of the date object to be stored i.e. timestamp/date/time
    @CreatedDate // it tells spring that only handle the creation date of the object
    Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // it tells spring that only handle the last modified date of the object
    Date updatedAt;
}

// new Review( String content, Double rating, Data createdAt, Data updatedAt)
