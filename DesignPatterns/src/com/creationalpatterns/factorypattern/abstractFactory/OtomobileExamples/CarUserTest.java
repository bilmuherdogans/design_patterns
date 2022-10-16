package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public class CarUserTest 
{
	public static void main(String[] args) 
	{
		CarFactoryImpl carFactory=new CarFactoryImpl();
		PassengersCar golf=carFactory.createPassengerCarFactory("12345","Golf");
		CommercialCar transporter=carFactory.createCommercialCarFactory("12345", "Transporter", "1500");
		
		System.err.println(golf.toString());
		System.err.println(transporter.toString());
	}

}
