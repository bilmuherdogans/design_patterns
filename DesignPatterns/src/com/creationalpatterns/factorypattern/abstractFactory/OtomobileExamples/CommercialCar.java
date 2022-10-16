package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public class CommercialCar extends Car {

	public CommercialCar(String carSerialNumber, String model, String capacity) {
		super(carSerialNumber, model, capacity);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return model +" - "+ carSerialNumber+ " - "+ capacity;
	}

}
