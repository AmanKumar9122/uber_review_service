package com.example.UberReviewService.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) // cascade property automatically save which operation to be performed on the related entity.
    // it is used to define a one-to-one relationship between two entities.
    private Review review;

    @Enumerated(value = EnumType.STRING) // it is used to specify that a persistent property or field should be persisted as an enumerated type.
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP) // it is used to specify that a persistent property or field should be persisted as a temporal type.
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}
