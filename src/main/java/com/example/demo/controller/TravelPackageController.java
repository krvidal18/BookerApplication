package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TravelPackage;
import com.example.demo.services.TravelPackageService;

@RestController
@RequestMapping("/travel-packages")
public class TravelPackageController {
	TravelPackageService travelPackageService;

	public TravelPackageController(TravelPackageService travelPackageService) {
		this.travelPackageService = travelPackageService;
	}

	@GetMapping
	public List<TravelPackage> getTravelPackages() {
		return travelPackageService.getAllTravelPackages();
	}

	@PostMapping
	public List<TravelPackage> createTravelPackages(List<TravelPackage> travelPackages) {
		return travelPackageService.createTravelPackages(travelPackages);
	}

}
