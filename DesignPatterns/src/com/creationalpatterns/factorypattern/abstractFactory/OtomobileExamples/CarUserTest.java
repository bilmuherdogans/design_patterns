package com.creationalpatterns.factorypattern.abstractFactory.OtomobileExamples;

public class CarUserTest 
{
	public static void main(String[] args) 
	{
		System.err.println("\n****** Sup level\n");
		CarFactory carFactory=new CarFactoryImpl();
		Car golf=carFactory.createPassengerCarFactory("12345","Golf");
		Car transporter=carFactory.createCommercialCarFactory("12345", "Transporter", "1500");
		
		System.err.println(golf.toString());
		System.err.println(transporter.toString());
		
		System.err.println("\n****** Sub level\n");
		
		CarFactory carFactoryImpl=new CarFactoryImpl();
		PassengersCar tofas=(PassengersCar) carFactoryImpl.createPassengerCarFactory("11111","Tofas");
		CommercialCar iveco=(CommercialCar) carFactoryImpl.createCommercialCarFactory("22222", "Iveco", "12500");
		
		System.err.println(tofas.toString());
		System.err.println(iveco.toString());
		System.err.println("\n******\n");
	
	}

}
