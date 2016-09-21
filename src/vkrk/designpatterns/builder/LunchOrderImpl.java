package com.vkrk.designpatterns.builder;

public class LunchOrderImpl {

	public static void main(String[] args) {
		LunchOrder lunchOrder = new LunchOrder.Builder()
				.bread("sample bread")
				.isVegetarian(true)
				.build();
		System.out.println(lunchOrder);
	}

}
