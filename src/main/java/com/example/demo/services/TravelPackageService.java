package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.Image;
import com.example.demo.model.TravelPackage;
import com.example.demo.model.TravelService;
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
			List<Image> images = travelPackage.getImages();
			for (Image image : images) {
				image.setTravelPackage(travelPackage);
			}
			imageRepository.saveAll(images);

			List<TravelService> travelServices = travelPackage.getAvailableServiceList();
			for (TravelService service : travelServices) {
				service.setTravelPackage(travelPackage);
			}
			travelServiceService.createServices(travelServices);
		}
		return (List<TravelPackage>) travelPackageRepository.saveAll(travelPackages);
	}
}
