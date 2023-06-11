package com.assignment.demo.service;

import com.assignment.demo.model.Flight;
import com.assignment.demo.model.User;
import com.assignment.demo.model.UserDto;

import java.util.ArrayList;
import java.util.List;

public interface FlightService {
    List<Flight> getAllFlight();

     Flight getFlight(Long id);

     void addFlight(Flight flight);

     void updateFlight(Long id, Flight flight);

     void deleteFlight(Long id);

     //Flight findOne(String username);
}
