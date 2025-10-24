package com.example.vehicle.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.parking.pojo.Ticket;
import com.example.vehicle.parking.pojo.Vehicle;

@RestController
public class ParkingController {
	
	
	@PostMapping("/build")
	public String build() {
		return "Success";
	}
	
	@PostMapping("/park")
	public Ticket park(Vehicle vehicle) {
		return new Ticket();
	}

	@PostMapping("/unpark")
	public void unpark(int ticketNumber) {
		
	}
	
	@GetMapping("/availableSpots")
	public String getAvailableSpots() {
		return "available";
	}
	
}
