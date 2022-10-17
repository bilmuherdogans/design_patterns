package com.creationalpatterns.prototype.humanExample;

public class HumanTest {
	
	public static void main(String[] args) 
	{
		Human british=new Human("British"); 
		
		Human numberOneMan=british.clone();
		numberOneMan.setAge(15);
		numberOneMan.setSurname("Hottinger");
		numberOneMan.setFatherName("John");
		numberOneMan.setMotherName("Maria");
		numberOneMan.setGender("male");
		numberOneMan.setMarried(false);
		
		Human elderBrotherOfNumberOneMan=numberOneMan.clone();
		elderBrotherOfNumberOneMan.setAge(30);
		elderBrotherOfNumberOneMan.setMarried(true);
		
		System.err.println("NumberOneMan's age : "+numberOneMan.getAge());
		System.err.println("NumberOneMan's mother name : "+numberOneMan.getMotherName());
		System.err.println("NumberOneMan's elder brother's age : "+elderBrotherOfNumberOneMan.getAge());
		System.err.println("NumberOneMan's elder brother's mother's name : "+elderBrotherOfNumberOneMan.getMotherName());
		System.err.println("NumberOneMan's elder brother's nationality : "+elderBrotherOfNumberOneMan.getNationality());
		
		
	}

}
