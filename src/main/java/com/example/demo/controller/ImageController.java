package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Image;
import com.example.demo.services.ImageService;

public class ImageController {
	@RestController
	@RequestMapping("/images")
	public class TravelServiceController {
		private ImageService imageService;

		@PostMapping
		public List<Image> createImages(@RequestBody List<Image> images) {
			return imageService.createImages(images);
		}

		@GetMapping
		public List<Image> getAllServices() {
			return imageService.getImages();
		}
	}
}
