package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public class HomeStuffTestBuilder 
{
	public static void main(String[] args) 
	{
		HomeStuffsBuilder builder=new HomeStuffsBuilderImpl();
		System.err.println("\n*******************\n");
		HomeStuffs basicHomePackage=builder.buildHomeStuffBasicPacket();
		System.err.println("Home's carpet color: "+basicHomePackage.getCarpet().getColor());
		System.err.println("Home's carpet's brand : "+basicHomePackage.getCarpet().getBrand());
		
		System.err.println("\n*******************\n");
		
		HomeStuffs fullPackage=builder.buildHomeStuffFullPacket();
		System.err.println("Home's TV  color: "+fullPackage.getTv().getColor());
		System.err.println("Home's TV's brand : "+fullPackage.getTv().getBrand());
		
		
		
	}

}
