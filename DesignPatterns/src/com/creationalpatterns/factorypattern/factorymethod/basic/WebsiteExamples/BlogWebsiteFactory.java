package com.creationalpatterns.factorypattern.factorymethod.basic.WebsiteExamples;

public class BlogWebsiteFactory implements Factory
{

	@Override
	public BlogWebsite createWebsite() {
		BlogWebsite website=new BlogWebsite("myblog.com","blog");
		return website;
	}

}
