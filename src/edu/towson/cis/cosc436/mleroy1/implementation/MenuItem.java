package edu.towson.cis.cosc436.mleroy1.implementation;

public class MenuItem {
	private String name;
	private double price;
	private boolean hh;
	
	public MenuItem(String name,double price, boolean heartHealthy){
		this.name=name;
		this.price=price;
		hh=heartHealthy;
	}
	public MenuItem(MenuItem m){
		this.name=m.name;
		this.price=m.price;
		this.hh=m.hh;
	}

	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public boolean isHeartHealthy(){
		return hh;
	}
}
