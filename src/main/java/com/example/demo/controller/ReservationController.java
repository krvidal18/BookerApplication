package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Reservation;
import com.example.demo.services.ReservationService;

public class ReservationController {
	ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@GetMapping
	public List<Reservation> getAllReservations() {
		return reservationService.getAllReservations();
	}

}
