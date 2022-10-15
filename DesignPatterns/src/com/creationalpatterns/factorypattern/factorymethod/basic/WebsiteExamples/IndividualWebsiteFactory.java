package com.creationalpatterns.factorypattern.factorymethod.basic.WebsiteExamples;

public class IndividualWebsiteFactory implements Factory 
{

	@Override
	public IndividualWebsite createWebsite() {
		IndividualWebsite website=new IndividualWebsite("individual.com","common");
		return website;
	}

}
