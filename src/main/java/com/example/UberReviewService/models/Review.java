package com.example.UberReviewService.models;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@Getter // it creates getter methods for all the fields
@Setter  // it creates setter methods for all the fields
@Builder // it creates a builder pattern for the class
@NoArgsConstructor // it creates a no-argument constructor
@AllArgsConstructor // it creates a constructor with all the fields as arguments

@Entity // it is used to declare a class as an entity and map it to a database table
@Table(name = "bookingreview") // it make changes in the database table name
public class Review {

    @Id //used for declare primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            // Sequence - it creates a new table in the database and auto increments the id
            // Identity - it auto increments the id
    private Long id;

    @Column(nullable = false)
    private String content;

    private Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //this annotation tells spring about the format of the date object to be stored i.e. timestamp/date/time
    @CreatedDate // it tells spring that only handle the creation date of the object
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // it tells spring that only handle the last modified date of the object
    private Date updatedAt;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

// new Review( String content, Double rating, Data createdAt, Data updatedAt)
