package com.creationalpatterns.singletonpattern.SolutionsOfBillPugh;

public class SinglePatternOfBillPughTest 
{
	public static void main(String[] args) 
	{
		SinglePatternOfBillPugh singlePatternOfBillPugh_instance1=SinglePatternOfBillPugh.getSinglePatternOfBillPugh();
		SinglePatternOfBillPugh singlePatternOfBillPugh_instance2=SinglePatternOfBillPugh.getSinglePatternOfBillPugh();
	
		if(singlePatternOfBillPugh_instance2==singlePatternOfBillPugh_instance1) 
		{
			System.err.println("Objects are equals.");
		}else {
			System.err.println("Objects are not equals.");
		}
		
	}
}
