package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public class Car 
{
    String carSerialNumber;
    String model;
    String capacity;
	
	public Car(String carSerialNumber,String model) {
		 this.carSerialNumber=carSerialNumber;
		 this.model=model;
	}
	public Car(String carSerialNumber,String model,String capacity) {
		 this.carSerialNumber=carSerialNumber;
		 this.model=model;
		 this.capacity=capacity;
	}
}
