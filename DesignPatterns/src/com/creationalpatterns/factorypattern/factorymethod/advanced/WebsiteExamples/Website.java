package com.creationalpatterns.factorypattern.factorymethod.advanced.WebsiteExamples;

import java.util.Date;

public class Website {

	private String domain;
	private String type;
	private Date time;
	
	public Website(String domain,String type , Date time) {
			this.domain=domain;
			this.type=type;
			this.time=time;
	}
	
	@Override
	public String toString()
	{
		return "Creation Time :"+this.time+" : Type : " +this.type+" Domain : "+this.domain;
	}
	
}
