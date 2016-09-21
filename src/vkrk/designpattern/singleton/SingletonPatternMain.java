package com.vkrk.designpattern.singleton;

public class SingletonPatternMain {

	public static void main(String[] args) {
		SingletonPattern instance= SingletonPattern.getInstance();
		System.out.println(instance);
		
		SingletonPattern anotherInstance = SingletonPattern.getInstance();
		System.out.println(anotherInstance);
		
		if(instance==anotherInstance){
			System.out.println("Both instance referring to same object..");
		}

	}

}
