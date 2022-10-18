package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public class TV {
	private String brand;
	private String color;
	private int screnSize;
	private int size;
	private String yearOfProduction;
	private String placeOfProduction;
	
	public TV (String brand,String color) {
		this.brand=brand;
		this.color=color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getScrenSize() {
		return screnSize;
	}

	public void setScrenSize(int screnSize) {
		this.screnSize = screnSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(String yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getPlaceOfProduction() {
		return placeOfProduction;
	}

	public void setPlaceOfProduction(String placeOfProduction) {
		this.placeOfProduction = placeOfProduction;
	}
}
