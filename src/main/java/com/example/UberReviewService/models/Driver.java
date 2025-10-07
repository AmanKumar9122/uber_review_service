package com.example.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Driver extends BaseModel{

    private String name;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    // 1:n , Diver : Booking
    @OneToMany(mappedBy = "driver") // mappedBy is used to specify the field that owns the relationship.
    private List<Booking> bookings = new ArrayList<>();


}
