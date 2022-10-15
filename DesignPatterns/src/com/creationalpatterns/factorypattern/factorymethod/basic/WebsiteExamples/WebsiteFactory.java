package com.creationalpatterns.factorypattern.factorymethod.basic.WebsiteExamples;


public class WebsiteFactory implements Factory 
{

	@Override
	public Website createWebsite() {
	    Website website=new Website("/","root");
		return website;
	}

}
