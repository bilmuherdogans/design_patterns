package com.creationalpatterns.factorypattern.factorymethod.advanced.WebsiteExamples;

import java.util.Date;

public class IndividualWebsiteFactory implements Factory 
{

	@Override
	public IndividualWebsite createWebsite(Date time)  {
		IndividualWebsite website=new IndividualWebsite("individual.com","common",time);
		return website;
	}

}
