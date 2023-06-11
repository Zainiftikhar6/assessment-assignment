package com.assignment.demo.dao;

import com.assignment.demo.model.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightDao extends CrudRepository<Flight, Long> {
    Optional<Flight> findByOrigin(String origin);

    Optional<Flight> findByDestination(String destination);
    @Query(
            value = "select * from flight where max_capacity>0",
            nativeQuery = true)
    Iterable<Flight> getAllAvailableFlights();
}