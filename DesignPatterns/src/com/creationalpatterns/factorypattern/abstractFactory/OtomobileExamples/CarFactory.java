package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public interface CarFactory {

	Car createPassengerCarFactory(String carSerialNumber,String model);
	Car createCommercialCarFactory(String carSerialNumber,String model,String capacity);
}
