package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue
	private int feedbackId;
	private String feedback;
	private int rate;
	// private Reservation reservation;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	/*
	 * public Reservation getReservation() { return reservation; }
	 * 
	 * public void setReservation(Reservation reservation) { this.reservation =
	 * reservation; }
	 */

}
