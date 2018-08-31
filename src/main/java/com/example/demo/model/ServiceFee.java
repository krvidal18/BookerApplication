package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceFee {
	@Id
	private int serviceFeeId;
	private double amount;
	private TravelService service;
	private String startDate;

	public int getServiceFeeId() {
		return serviceFeeId;
	}

	public void setServiceFeeId(int serviceFeeId) {
		this.serviceFeeId = serviceFeeId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TravelService getService() {
		return service;
	}

	public void setService(TravelService service) {
		this.service = service;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
