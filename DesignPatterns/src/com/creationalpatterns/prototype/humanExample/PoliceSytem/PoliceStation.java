package com.creationalpatterns.prototype.humanExample.PoliceSytem;

public class PoliceStation  implements PoliceDepartmant{
	
	private Human suspiciousPerson=new Human(null);
	
 
	
	@Override
	public Human getCriminal(String gender, String name, String surname) {
	 
		return findCriminal(gender, name, surname);
	}
	
	public Human findCriminal(String gender, String name, String surname) {
		suspiciousPerson.setName("James");
		suspiciousPerson.setSurname("Bond");
		suspiciousPerson.setMotherName("Maria");
		return suspiciousPerson.clone();
	}

}
