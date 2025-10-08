package com.example.UberReviewService.repositories;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface DriverRepository extends JpaRepository<Driver, Long> {
    // Derived Query
    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

    // Raw SQL Query
    // here attribute names should match exactly with the column names in the database
    // if it is not matching then we will get error a runtime error
    @Query(nativeQuery = true, value = "SELECT * FROM DRIVER WHERE id = :id AND license_number = :license" )
    Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String license);

    // Here attribute names can be different from the column names in the database
    // Hibernate query language (HQL)
    @Query("SELECT d FROM Driver d WHERE d.id = :id AND d.licenseNumber = :ln")
    Optional<Driver> hqlFindByIdAndLicence(Long id, String ln);
}
