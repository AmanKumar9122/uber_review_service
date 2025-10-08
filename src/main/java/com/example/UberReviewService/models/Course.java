package com.example.UberReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Course extends BaseModel {

    private String courseName;

    @ManyToMany
    private List<Student> students= new ArrayList<>();
}
