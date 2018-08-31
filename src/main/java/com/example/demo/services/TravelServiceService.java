package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.Image;
import com.example.demo.model.TravelService;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.TravelServiceRepository;

public class TravelServiceService {
	private TravelServiceRepository travelServiceRepository;
	private ImageRepository imageRepository;

	public TravelServiceService(TravelServiceRepository travelServiceRepository, ImageRepository imageRepository) {
		this.travelServiceRepository = travelServiceRepository;
		this.imageRepository = imageRepository;
	}

	@Transactional
	public List<TravelService> createServices(List<TravelService> services) {
		List<TravelService> services2 = (List<TravelService>) travelServiceRepository.saveAll(services);
		for (TravelService service : services2) {
			List<Image> images = (List<Image>) imageRepository.saveAll(service.getImages());
			for (Image image : images) {
				image.setTravelService(service);
			}
		}
		return services2;
	}

	@Transactional
	public List<TravelService> findAllServices() {
		return (List<TravelService>) travelServiceRepository.findAll();
	}
}
