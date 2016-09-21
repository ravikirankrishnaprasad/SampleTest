package com.vkrk.designpattern.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Fast and Furious");
		
		System.out.println(movie);
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getUrl());
		System.out.println(movie.getTitle());
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Speed");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getPrice());
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getUrl());
		System.out.println(anotherMovie.getTitle());

	}

}
