package com.creationalpatterns.factorypattern.factorymethod.advanced.WebsiteExamples.copy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class FactoryMethodTest {

	public static void main(String[] args) 
	{
		
		Factory webSite = new WebsiteFactory();
		Factory individualWebsite = new IndividualWebsiteFactory();
		Factory blogWebsite = new BlogWebsiteFactory();
		ArrayList<Website> webSiteList = new ArrayList<Website>();
		
		try {
			Date createdTime = new Date();
			webSiteList.add(webSite.createWebsite(createdTime));
			TimeUnit.SECONDS.sleep(3);
			
			createdTime = new Date();
			webSiteList.add(individualWebsite.createWebsite(createdTime));
			TimeUnit.SECONDS.sleep(3);
			
			createdTime = new Date();
			webSiteList.add(blogWebsite.createWebsite(createdTime));

		} catch (Exception e) {
			e.getMessage();
		}

		for (Website site : webSiteList) {
			System.err.println(site.toString());
		}
	}

}

/*
Test code's output;

Creation Time :Sat Oct 15 23:37:26 TRT 2022 : Type : root Domain : /
Creation Time :Sat Oct 15 23:37:29 TRT 2022 : Type : common Domain : individual.com
Creation Time :Sat Oct 15 23:37:32 TRT 2022 : Type : blog Domain : myblog.com

*/
