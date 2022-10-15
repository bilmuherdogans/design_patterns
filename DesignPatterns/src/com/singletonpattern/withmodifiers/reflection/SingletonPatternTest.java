package com.singletonpattern.withmodifiers.reflection;

import java.lang.reflect.Constructor;

public class SingletonPatternTest {
	
	public static void main(String[] args) 
	{
		 
		System.err.println("*********** Before the reflection - basic singleton");
		SingletonPattern singletonObject=SingletonPattern.getSingletonObject();
		SingletonPattern singletonObject2=SingletonPattern.getSingletonObject();
		 
		
		if(singletonObject==singletonObject2) {
			System.err.println( "Objects is equals..");
		}else {
			System.err.println("Objects is not equals..");
		}
		
		
		System.err.println("*********** After the reflection");
		
		Class<SingletonPattern> singletonPatternClass=SingletonPattern.class;
		Constructor<SingletonPattern>  singletonPatternClassConstructor=null;
		try 
		{
			singletonPatternClassConstructor=singletonPatternClass.getDeclaredConstructor(null);
			singletonPatternClassConstructor.setAccessible(true);
			
			SingletonPattern object1=singletonPatternClassConstructor.newInstance(null);
			SingletonPattern object2=singletonPatternClassConstructor.newInstance(null);
			
			if(object1==object2) {
				System.err.println("After the reflection Objects is equals..");
			}else {
				System.err.println("After the reflection Objects is not equals..");
			}
		} catch (Exception e) 
		{
			 
		}
		
	}
}
