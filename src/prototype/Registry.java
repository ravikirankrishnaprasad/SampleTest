package com.vkrk.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Item> items=new HashMap<>();
	
	public Registry(){
		loadItems();
	}
	
	public Item createItem(String type){
		Item item=null;
		
		try{
			item = (Item) items.get(type).clone();
			
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems(){
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(180);
		movie.setRuntime("2.5 hours");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(350);
		book.setTitle("Basic book");
		book.setPrice(350);
		items.put("Book", book);
		
	}

}
