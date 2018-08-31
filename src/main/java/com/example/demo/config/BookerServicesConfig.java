package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.TravelServiceRepository;
import com.example.demo.repository.TravelPackageRepository;
import com.example.demo.services.CustomerService;
import com.example.demo.services.TravelPackageService;
import com.example.demo.services.TravelServiceService;

@Configuration
public class BookerServicesConfig {
	@Bean
	public CustomerService customerService(CustomerRepository customerRepository) {
		return new CustomerService(customerRepository);
	}

	@Bean
	public TravelPackageService travelPackageService(TravelPackageRepository travelPackageRepository,
			TravelServiceService travelServiceService, ImageRepository imageRepository) {
		return new TravelPackageService(travelPackageRepository, travelServiceService, imageRepository);
	}

	@Bean
	public TravelServiceService travelServiceService(TravelServiceRepository serviceRepository,
			ImageRepository imageRepository) {
		return new TravelServiceService(serviceRepository, imageRepository);
	}
}
