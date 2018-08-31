package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {
	@Id
	private int reservationId;
	private List<TravelService> availedServiceList;
	private String departureDate;
	private Customer customer;

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public List<TravelService> getAvailedServiceList() {
		return availedServiceList;
	}

	public void setAvailedServiceList(List<TravelService> availedServiceList) {
		this.availedServiceList = availedServiceList;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
