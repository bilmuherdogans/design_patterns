package com.creationalpatterns.factorypattern.factorymethod.basic.WebsiteExamples;

public class Website {

	private String domain;
	private String type;
	
	public Website(String domain,String type) {
			this.domain=domain;
			this.type=type;
	}
	
	@Override
	public String toString()
	{
		return "Type : " +this.type+" Domain : "+this.domain;
	}
	
}
