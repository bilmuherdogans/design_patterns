package com.creationalpatterns.singletonpattern.withEnum;

import java.util.ArrayList;

public class SingletonPatternTest {
	
	public static void main(String[] args) {
		
		SingletonPatternEnum singletonPatternEnum=SingletonPatternEnum.SINGLETON;
		SingletonPatternEnum singletonPatternEnum2=SingletonPatternEnum.getSingleton();
		
		if(singletonPatternEnum.equals(singletonPatternEnum2)) {
			System.err.println("The enums are equals.");
			System.err.println("singletonPatternEnum  parameters: "+singletonPatternEnum.getEnumParameters());
			System.err.println("singletonPatternEnum2 parameters: "+singletonPatternEnum2.getEnumParameters());
			 
		}
		
	}

}
