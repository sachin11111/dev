package com.example.vehicle.parking.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle.parking.model.ParkingLotRepository;
import com.example.vehicle.parking.model.ParkingSpotRepository;
import com.example.vehicle.parking.model.TicketRepository;
import com.example.vehicle.parking.pojo.ParkingSpot;
import com.example.vehicle.parking.pojo.Ticket;
import com.example.vehicle.parking.pojo.Vehicle;

@Service
public class ParkingLotService {
	
	 @Autowired
	 private ParkingLotRepository parkingLotRepository;
	 @Autowired
	 private ParkingSpotRepository parkingSpotRepository;
	 @Autowired
	 private TicketRepository ticketRepository;

	public ArrayList<ParkingSpot> getAvailableParkingSpot() {
		return null;
	}
	
	public Ticket assignParkingSpot(Vehicle vehicle, ParkingSpot spot) {
		return null;
	}
	
	public int releaseParkingSpot(Vehicle vehicle, ParkingSpot spot) {
		return 0;
	}
	
}