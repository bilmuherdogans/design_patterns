package com.singletonpattern.withmodifiers.LazyLoading.forMultithread;

public class SingletonPatternTest {
	
	public static void main(String[] args) 
	{
		 
	  //SingletonPattern singletonObject=new SingletonPattern(); This is not possible..	Because,constructor is private.
		
		SingletonPattern singletonObject=SingletonPattern.getSingletonObject();
		singletonObject.whatIsTheIntentOfSingleton();
		
	}
}
