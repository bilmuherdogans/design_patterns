package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public class PassengersCar extends Car {

	public PassengersCar(String carSerialNumber, String model) {
		super(carSerialNumber, model);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return model +" - "+ carSerialNumber;
	}

}
