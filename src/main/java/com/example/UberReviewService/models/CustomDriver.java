package com.example.UberReviewService.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CustomDriver {
    private Long id;

    private String name;

    public CustomDriver(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}


