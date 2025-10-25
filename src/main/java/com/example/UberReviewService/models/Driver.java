package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {

    private String name;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    // 1:n, Driver : Booking
    @OneToMany(mappedBy = "driver", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Fetch(FetchMode.SUBSELECT) // avoids N+1 problem
    @Builder.Default
    private List<Booking> bookings = new ArrayList<>();
}
