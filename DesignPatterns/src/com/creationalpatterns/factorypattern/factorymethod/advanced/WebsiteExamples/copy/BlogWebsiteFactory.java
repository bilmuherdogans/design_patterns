package com.creationalpatterns.factorypattern.factorymethod.advanced.WebsiteExamples.copy;

import java.util.Date;

public class BlogWebsiteFactory implements Factory
{

	@Override
	public BlogWebsite createWebsite(Date time) {
		BlogWebsite website=new BlogWebsite("myblog.com","blog",time);
		return website;
	}

}
