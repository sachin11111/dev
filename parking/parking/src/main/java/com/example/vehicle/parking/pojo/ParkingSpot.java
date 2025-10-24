package com.example.vehicle.parking.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ParkingSpot {
	
	@Id
	String spotNumber;
	String type;
	int availabilityStatus;
	public String getSpotNumber() {
		return spotNumber;
	}
	public void setSpotNumber(String spotNumber) {
		this.spotNumber = spotNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(int availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	
	

}
