package com.creationalpatterns.factorypattern.factorymethod.basic.WebsiteExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class FactoryMethodTest {
	
	public static void main(String[] args) 
	{
		 Factory webSite=new WebsiteFactory();
		 Factory individualWebsite=new IndividualWebsiteFactory();
		 Factory blogWebsite=new BlogWebsiteFactory();
		
		 
		 ArrayList<Website> webSiteList=new ArrayList<Website>();
		 webSiteList.add(webSite.createWebsite());
		 webSiteList.add(individualWebsite.createWebsite());
		 webSiteList.add(blogWebsite.createWebsite());
		
		
		 for (Website site : webSiteList)
		 {
			 System.err.println(site.toString());
		 }
	}

}
