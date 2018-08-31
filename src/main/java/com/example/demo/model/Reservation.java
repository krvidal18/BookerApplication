package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private int reservationId;
	@OneToMany
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
