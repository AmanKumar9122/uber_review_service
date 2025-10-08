package com.example.UberReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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


public class Student extends BaseModel {

    private String name;

    private String rollNo;

    @ManyToMany
    @JoinTable(
            name = "course_students", // name of the join table
            joinColumns = @JoinColumn(name = "student_id"), // name of the foreign key column in the join table that references the primary key of the current entity (Student)
            inverseJoinColumns = @JoinColumn(name = "course_id") // name of the foreign key column in the join table that references the primary key of the other entity (Course)
    )

    private List<Course> courses = new ArrayList<>();
}
