package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public class CarFactoryImpl  implements CarFactory
{

	@Override
	public PassengersCar createPassengerCarFactory(String carSerialNumber, String model) {
		return new PassengersCar(carSerialNumber, model);
	}

	@Override
	public CommercialCar createCommercialCarFactory(String carSerialNumber, String model, String capacity) {
		return new CommercialCar(carSerialNumber, model, capacity);
	}

}
