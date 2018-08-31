package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TravelPackage {
	@Id
	@GeneratedValue
	private int travelPackageId;
	private String packageName;
	@OneToMany
	private List<TravelService> availableServiceList;
	@OneToMany
	private List<Image> images;

	public int getTravelPackageId() {
		return travelPackageId;
	}

	public void setTravelPackageId(int travelPackageId) {
		this.travelPackageId = travelPackageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<TravelService> getAvailableServiceList() {
		return availableServiceList;
	}

	public void setAvailableServiceList(List<TravelService> availableServiceList) {
		this.availableServiceList = availableServiceList;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

}
