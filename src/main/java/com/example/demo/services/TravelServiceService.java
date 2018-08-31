package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.TravelService;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.ServiceRepository;

public class TravelServiceService {
	private ServiceRepository serviceRepository;
	private ImageRepository imageRepository;

	public TravelServiceService(ServiceRepository serviceRepository, ImageRepository imageRepository) {
		this.serviceRepository = serviceRepository;
		this.imageRepository = imageRepository;
	}

	@Transactional
	public List<TravelService> createServices(List<TravelService> services) {
		for (TravelService service : services) {
			imageRepository.saveAll(service.getImage());
		}
		return (List<TravelService>) serviceRepository.saveAll(services);
	}

}
