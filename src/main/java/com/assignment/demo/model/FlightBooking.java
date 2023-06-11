package com.assignment.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
public class FlightBooking {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String flightNumber;

    @Column
    private Long userId;
    @Column
    private Long flightId;
    @Column
    private String noOfSeats;

}