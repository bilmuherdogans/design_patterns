package com.creationalpatterns.factorypattern.factorymethod.advanced.WebsiteExamples;

import java.util.Date;

public class WebsiteFactory implements Factory 
{

	@Override
	public Website createWebsite(Date time) {
	    Website website=new Website("/","root",time);
		return website;
	}

}
