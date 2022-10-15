package com.creationalpatterns.singletonpattern.SolutionsOfBillPugh;

public class SinglePatternOfBillPugh 
{
	private static class SingletonFactory 
	{
		private static final SinglePatternOfBillPugh singlePatternOfBillPugh=new SinglePatternOfBillPugh();
	}
	
	public static SinglePatternOfBillPugh getSinglePatternOfBillPugh() 
	{
		return SinglePatternOfBillPugh.SingletonFactory.singlePatternOfBillPugh;
	}

}
