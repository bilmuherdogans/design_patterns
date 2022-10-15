package com.creationalpatterns.factorypattern.factorymethod.SuggestionOfBloch;

import java.util.Date;

public class WebSite {
	
	private String domain;
	private String type;
	private Date time;
	
	private WebSite(String domain,String type, Date time) {
		this.domain=domain;
		this.time=time;
		this.type=type;
	}
	
	public static WebSite getWebsite(String domain,String type, Date time) {
		return new WebSite(domain,type,time);
	}
	
	@Override
	public String toString() {
		return this.time+ " - "+this.domain +" - "+this.type;
	}
}
