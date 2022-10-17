package com.creationalpatterns.prototype.humanExample;

public class Human 	implements Cloneable {
	
	private int age;
	private String gender;
	private String motherName;
	private String fatherName;
	private String name;
	private String surname;
	private String nationality;
	private boolean isLife;
	private boolean isMarried;
	
	
	public Human(String nationality) {
		super();
		this.nationality = nationality;
	}
	
	
	@Override
	protected Human clone() 
	{
		Human person=null;
		try 
		{
			person=(Human)super.clone();	
		} 
		catch (CloneNotSupportedException e)
		{
			 System.err.println(e.getMessage());
		}
		
		return person;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public boolean isLife() {
		return isLife;
	}
	public void setLife(boolean isLife) {
		this.isLife = isLife;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
}
