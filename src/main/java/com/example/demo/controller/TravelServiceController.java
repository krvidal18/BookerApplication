package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TravelService;
import com.example.demo.services.TravelServiceService;

@RestController
@RequestMapping("/services")
public class TravelServiceController {
	private TravelServiceService travelServiceService;

	@PostMapping
	public List<TravelService> createServices(@RequestBody List<TravelService> services) {
		return travelServiceService.createServices(services);
	}

	@GetMapping
	public List<TravelService> getAllServices() {
		return travelServiceService.findAllServices();
	}
}
