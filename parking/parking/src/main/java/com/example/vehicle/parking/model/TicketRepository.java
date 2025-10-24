package com.example.vehicle.parking.model;

import org.springframework.data.repository.Repository;

import com.example.vehicle.parking.pojo.ParkingLot;
import com.example.vehicle.parking.pojo.Ticket;

@org.springframework.stereotype.Repository
public class TicketRepository implements Repository<Ticket, String> {

}
