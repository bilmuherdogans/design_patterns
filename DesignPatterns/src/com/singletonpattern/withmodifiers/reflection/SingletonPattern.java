package com.singletonpattern.withmodifiers.reflection;
/**
 * 
 * @author bilmuherdogans
 * @apiNote 
 * <b><i style="color:white; background-color:green;"><br>intent: Ensure a class only has one instance , and provide a global point of access to it. </i> </b>
 * <b><i style="color:white; background-color:red;"><br> Design Patterns - Element of  Reusable O.O.S - GoF </i> </b><br>
 * <br>There are many way to do singleton. One of them is to make "constructor" and "object member instance" private. and to give global access to instance.
 */
public class SingletonPattern 
{
	
	private static SingletonPattern singletonPattern=new SingletonPattern();
	
	private SingletonPattern() 
	{
	
	}
	
	public static SingletonPattern getSingletonObject() {
		return singletonPattern;
	}
	
	public void whatIsTheIntentOfSingleton() 
	{
		System.err.println("Ensure a class only has one instance , and provide a global point of access to it. GoF");
	}
}
