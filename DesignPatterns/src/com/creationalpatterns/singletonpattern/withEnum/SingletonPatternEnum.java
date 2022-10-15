package com.creationalpatterns.singletonpattern.withEnum;

import java.io.Serializable;

public enum SingletonPatternEnum implements Serializable{
	
	SINGLETON("Harold","Finch");
	
	private String name;
	private String surname;
	
	private SingletonPatternEnum(String name,String surname) {
		System.err.println("Engum - constructor -initilation");
		this.name=name;
		this.surname=surname;
	}
	
	public static  SingletonPatternEnum getSingleton(){
		return SINGLETON;
	}
	public static  String getEnumParameters(){
		return SINGLETON.name +" - "+ SINGLETON.surname;
	}

}
