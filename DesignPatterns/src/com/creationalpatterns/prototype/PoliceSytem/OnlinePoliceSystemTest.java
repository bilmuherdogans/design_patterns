package com.creationalpatterns.prototype.PoliceSytem;

/**
 * 
 * @author bilmuherdogans
 * 
 * @apiNote This examples ,It was created to hide the object creation process.
 * Some values was defined behind of factory method.
 *
 */
public class OnlinePoliceSystemTest {
	
	public static void main(String[] args) 
	{
		 
		PoliceDepartmant onlinePoliceSystem=new PoliceStation();
		Human wantedMan=onlinePoliceSystem.getCriminal("male", "james", "bond");
		
		System.err.println(wantedMan.getMotherName());
		
	}

}
