package com.assignment.demo.controller;

import com.assignment.demo.model.*;
import com.assignment.demo.service.FlightService;
import com.assignment.demo.service.impl.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("")
public class FlightController {

    @Autowired
    private FlightService flightService;
    @Autowired
    private FlightBookingService flightBookingService;

    @RequestMapping(value="/flights", method=RequestMethod.GET)
    public List<Flight> getAllFlights(){
        return flightService.getAllFlight();
    }

    @RequestMapping(value="/flights/{id}", method=RequestMethod.GET)
    public Flight getFlight(@PathVariable Long id) {
        return flightService.getFlight(id);
    }

    @RequestMapping(value="/flights", method=RequestMethod.POST)
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @RequestMapping(value="/flights/{id}", method=RequestMethod.PUT)
    public void updateFlight(@PathVariable Long id, @RequestBody Flight Flight) {
        flightService.updateFlight(id, Flight);
    }

    @RequestMapping(value="/flights/{id}", method=RequestMethod.DELETE)
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }

    @PutMapping("/flightBooking/{flightId}")
    public String BookFlightSeats(@PathVariable Long flightId, @PathVariable Long userId, @PathVariable String noOfSeats
                                  ) throws Exception {
        flightBookingService.bookFlight(flightId, userId, noOfSeats);
        return "Flight has been successfully booked :: " + flightId;
    }
    @RequestMapping(value="/availableFlights", method=RequestMethod.GET)
    public Iterable<Flight> availableFlights() {
        return flightBookingService.getAllAvailableFlights();
    }
}
