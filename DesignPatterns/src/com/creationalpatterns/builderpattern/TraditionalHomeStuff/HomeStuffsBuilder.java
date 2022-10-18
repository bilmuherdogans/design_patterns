package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public interface HomeStuffsBuilder 
{
	Carpet buildCarpet(String brand,String color);
	Freezer buildFreezer(String brand,String color);
	TV buildTV(String brand,String color);
	HomeStuffs buildHomeStuffMiddlePacket();
	HomeStuffs buildHomeStuffFullPacket();
	HomeStuffs buildHomeStuffBasicPacket();
}
