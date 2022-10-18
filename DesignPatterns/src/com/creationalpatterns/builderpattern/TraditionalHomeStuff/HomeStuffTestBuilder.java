package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public class HomeStuffTestBuilder 
{
	public static void main(String[] args) {
		HomeStuffsBuilder builder=new HomeStuffsBuilderImpl();
		HomeStuffs homeStufPackage=builder.buildHomeStuffPacket();
		System.err.println("Home's carpet : "+homeStufPackage.getCarpet().getColor());
		System.err.println("Home's carpet's brand : "+homeStufPackage.getCarpet().getBrand());
	}

}
