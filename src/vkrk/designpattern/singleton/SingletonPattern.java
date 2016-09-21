package com.vkrk.designpattern.singleton;

public class SingletonPattern {
	
	private static SingletonPattern instance = null;
	
	private SingletonPattern(){
		
	}
	
	public static SingletonPattern getInstance(){
		if(instance ==null){   //Lazy Loading
			synchronized (SingletonPattern.class) { //Thread safe to make without performance hit
				if(instance==null){
					instance= new SingletonPattern();
				}
			}
		}

		return instance;
	}
	
	public static synchronized SingletonPattern getInstance1(){
		//This method will take a performance hit, since every time this method is called, 
		//will check for race condition 
		if(instance ==null){   //Lazy Loading
			instance= new SingletonPattern();
		}

		return instance;
	}

}
