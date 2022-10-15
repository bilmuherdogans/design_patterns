package com.creationalpatterns.factorypattern.factorymethod.SuggestionOfBloch;

import java.util.Date;

public class WebSiteTest {

	public static void main(String[] args) {
		
		//WebSite website=new WebSiteTest("turkey.gov.tr","enterprise",time); This is not possible.
		
		Date time=new Date();
		WebSite website=WebSite.getWebsite("turkey.gov.tr","enterprise",time);
		
		System.err.println(website.toString());
		
		
	}
}
