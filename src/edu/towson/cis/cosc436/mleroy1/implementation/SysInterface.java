package edu.towson.cis.cosc436.mleroy1.implementation;

public class SysInterface {
	private static Invoker invoker;
	
	
	public static Menu getMenu(){
		Menu menu=invoker.getMenu();
		//use menuItr to gather items and return as strings to user interface 
		return menu;
	}
	public static Menu getHeartHealthyMenu(){
		Menu menu=invoker.getHeartHealthyMenu();
		//same
		return menu;
	}
}
