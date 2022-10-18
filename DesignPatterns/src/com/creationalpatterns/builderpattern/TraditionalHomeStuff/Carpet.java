package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public class Carpet {
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	private String brand;
	private String color;
	private int length;
	private int with;
	private String yearOfProduction;
	private String placeOfProduction;
	
	public Carpet(String brand,String color) {
		this.brand=brand;
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWith() {
		return with;
	}
	public void setWith(int with) {
		this.with = with;
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
