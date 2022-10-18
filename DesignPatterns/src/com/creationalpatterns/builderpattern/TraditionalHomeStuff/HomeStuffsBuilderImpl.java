package com.creationalpatterns.builderpattern.TraditionalHomeStuff;

public class HomeStuffsBuilderImpl  implements HomeStuffsBuilder{
	
	private HomeStuffs homeStuffs;

	@Override
	public Carpet buildCarpet(String brand,String color) {
	    Carpet carpet=new Carpet(brand,color);
	    homeStuffs.setCarpet(carpet);
		return carpet;
	}

	@Override
	public Freezer buildFreezer(String brand,String color) {
		Freezer freezer=new Freezer(brand,color);
	    homeStuffs.setFreezer(freezer);
		return freezer;
	}

	@Override
	public TV buildTV(String brand,String color) {
		TV tv=new TV(brand,color);
		homeStuffs.setTv(tv);
		return tv;
	}

	@Override
	public HomeStuffs buildHomeStuffPacket() 
	{
		homeStuffs=new HomeStuffs();
		buildCarpet("bellona","red");
		buildFreezer("beko","white");
		buildTV("LG","Black");
		
		return homeStuffs;
	}
 
}
