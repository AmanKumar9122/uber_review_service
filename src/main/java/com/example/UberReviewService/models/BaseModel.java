package com.example.UberReviewService.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Date;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class) // it is used to listen to the entity lifecycle events
@MappedSuperclass // No table for the parent class will be created in the database
// one table for each child class having its own attributes & parms parent class attributes

public abstract class BaseModel {
    @Id //used for declare primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for joined and single table
    // @GeneratedValue(strategy = GenerationType.TABLE) // for table per class
    // Sequence - it creates a new table in the database and auto increments the id
    // Identity - it auto increments the id
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //this annotation tells spring about the format of the date object to be stored i.e. timestamp/date/time
    @CreatedDate // it tells spring that only handle the creation date of the object
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // it tells spring that only handle the last modified date of the object
    protected Date updatedAt;
}
