package com.example.UberReviewService.models;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter // it creates getter methods for all the fields
@Setter  // it creates setter methods for all the fields
@Builder // it creates a builder pattern for the class
@NoArgsConstructor // it creates a no-argument constructor
@AllArgsConstructor // it creates a constructor with all the fields as arguments

@Entity // it is used to declare a class as an entity and map it to a database table
@Table(name = "bookingreview") // it make changes in the database table name

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// not null constraint is not applicable on single table.
// no need of joins while fetching data
// one table for parent class and all child class attributes

public class Review extends BaseModel {
    @Column(nullable = false)
    private String content;

    private Double rating;

    @Override
    public String toString() {
        return "Review{" +
                ", content='" + content + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

// new Review( String content, Double rating, Data createdAt, Data updatedAt)
