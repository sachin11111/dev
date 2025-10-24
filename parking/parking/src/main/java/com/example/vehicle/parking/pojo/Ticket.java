package com.example.vehicle.parking.pojo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Ticket {
	
	@Id
	String number;
	@OneToOne
	ParkingSpot parkingSpot;
	Date entryTime;
	Date exitTime;
	@OneToOne
	Vehicle vehicle;
	int amountDue;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getExitTime() {
		return exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
	
	
}
