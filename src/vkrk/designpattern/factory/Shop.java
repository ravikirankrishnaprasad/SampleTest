package com.vkrk.designpattern.factory;

public class Shop extends Website{

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		
	}

}
