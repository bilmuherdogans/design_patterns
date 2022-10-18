package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public class HomeStuffs 
{
	private Carpet carpet;
	private Freezer freezer;
	private TV tv;
	
	
	public HomeStuffs() {
		
	}


	public Carpet getCarpet() {
		return carpet;
	}


	public void setCarpet(Carpet carpet) {
		this.carpet = carpet;
	}


	public Freezer getFreezer() {
		return freezer;
	}


	public void setFreezer(Freezer freezer) {
		this.freezer = freezer;
	}


	public TV getTv() {
		return tv;
	}


	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
	
}
