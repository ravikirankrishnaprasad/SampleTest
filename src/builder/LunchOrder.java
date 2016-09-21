package com.vkrk.designpatterns.builder;

public class LunchOrder {
	
	private final String bread;
	private final String condiments;
	private final boolean isVegetarian;
	
	public static class Builder{
		private  String bread;
		private  String condiments;
		private  boolean isVegetarian;
		
		public Builder bread(String bread){
			this.bread=bread;
			return this;
		}
		
		public Builder condiments(String condiments){
			this.condiments=condiments;
			return this;
		}
		
		public Builder isVegetarian(boolean isVegetarian){
			this.isVegetarian = isVegetarian;
			return this;
		}
		
		public LunchOrder build(){
			return new LunchOrder(this);
		}
		
	}
	
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.isVegetarian = builder.isVegetarian;
	}

	@Override
	public String toString() {
		return "LunchOrder [bread=" + bread + ", condiments=" + condiments + ", isVegetarian=" + isVegetarian + "]";
	}
	
	

}
