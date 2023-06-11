package com.assignment.demo.service.impl;

import com.assignment.demo.dao.FlightBookingDao;
import com.assignment.demo.dao.FlightDao;
import com.assignment.demo.dao.UserDao;
import com.assignment.demo.model.Flight;
import com.assignment.demo.model.FlightBooking;
import com.assignment.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightBookingService {
	private final static Logger LOG = LoggerFactory.getLogger(FlightBookingService.class);
	@Autowired
	private FlightDao flightRepo;
	@Autowired
	private UserDao userRepo;

	@Autowired
	private FlightBookingDao flightBookingRepo;

	public void bookFlight(Long flightId, Long userId, String noOfSeats) throws Exception {
		Optional<Flight> flights = flightRepo.findById(flightId);
		Optional<User> users = userRepo.findById(userId);
		if (!flights.isPresent()) {
			throw new Exception("Failed to book a flight. Invalid flightId :: " + flightId);
		}
		if (!users.isPresent()) {
			throw new Exception("Failed to book a flight. Invalid userId :: " + flightId);
		}

		Flight flight = flights.get();
		if(flight.getMaxCapacity() < 0){
			throw new Exception("Failed to book a flight. There is no capacity in this: " + flightId);
		}
		flight.setMaxCapacity(flight.getMaxCapacity()- Long.valueOf(noOfSeats));
		flightRepo.save(flight);

		FlightBooking flightBooking=new FlightBooking();
		flightBooking.setFlightId(flight.getId());
		flightBooking.setFlightNumber(flight.getFlightNumber());
		flightBooking.setUserId(userId);
		flightBookingRepo.save(flightBooking);

	}

	public Iterable<Flight> getAllAvailableFlights() {
		return flightRepo.getAllAvailableFlights();
	}
}
