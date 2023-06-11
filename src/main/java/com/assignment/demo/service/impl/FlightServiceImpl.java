package com.assignment.demo.service.impl;

import com.assignment.demo.dao.FlightDao;
import com.assignment.demo.model.Flight;
import com.assignment.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDao flightDao;

    public List<Flight> getAllFlight(){
        List<Flight> flights = new ArrayList<>();
        flightDao.findAll().forEach(flights::add);
        return flights;
    }

    public Flight getFlight(Long id) {
        return flightDao.findById(id).get();
    }

    public void addFlight(Flight flight) {
        flightDao.save(flight);
    }

    public void updateFlight(Long id, Flight flight) {
        flightDao.save(flight);
    }

    public void deleteFlight(Long id) {
        flightDao.deleteById(id);
    }
}
