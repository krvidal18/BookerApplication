package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Image {
	@Id
	@GeneratedValue
	private int imageId;
	private String description;
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "travelPackageId")
	TravelPackage travelPackage;

	@ManyToOne
	@JoinColumn(name = "serviceId")
	TravelService travelService;

	public TravelService getTravelService() {
		return travelService;
	}

	public void setTravelService(TravelService travelService) {
		this.travelService = travelService;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public TravelPackage getTravelPackage() {
		return travelPackage;
	}

	public void setTravelPackage(TravelPackage travelPackage) {
		this.travelPackage = travelPackage;
	}

}
