package com.assignment.demo.dao;

import com.assignment.demo.model.Flight;
import com.assignment.demo.model.FlightBooking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightBookingDao extends CrudRepository<FlightBooking, Long> {
}