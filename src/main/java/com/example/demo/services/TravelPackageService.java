package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.TravelPackage;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.TravelPackageRepository;

public class TravelPackageService {
	TravelPackageRepository travelPackageRepository;
	TravelServiceService travelServiceService;
	ImageRepository imageRepository;

	public TravelPackageService(TravelPackageRepository travelPackageRepository,
			TravelServiceService travelServiceService, ImageRepository imageRepository) {
		this.travelPackageRepository = travelPackageRepository;
		this.travelServiceService = travelServiceService;
		this.imageRepository = imageRepository;
	}

	@Transactional
	public List<TravelPackage> getAllTravelPackages() {
		return (List<TravelPackage>) travelPackageRepository.findAll();
	}

	@Transactional
	public List<TravelPackage> createTravelPackages(List<TravelPackage> travelPackages) {
		for (TravelPackage travelPackage : travelPackages) {
			travelServiceService.createServices(travelPackage.getAvailableServiceList());
			imageRepository.saveAll(travelPackage.getImages());
		}
		return (List<TravelPackage>) travelPackageRepository.saveAll(travelPackages);
	}
}
