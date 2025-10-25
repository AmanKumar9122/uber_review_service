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
public class Passenger extends BaseModel {

    private String name;

    // 1:n, Passenger : Booking
    @OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Fetch(FetchMode.SUBSELECT)
    @Builder.Default
    private List<Booking> bookings = new ArrayList<>();
}
