package com.vrc.model;

public class Truck extends Vehicle {

	private double loadCapacity;
	public Truck(String id, String brand, String model, double pricePerDay,double loadCapacity) {
		super(id, brand, model, pricePerDay);
		// TODO Auto-generated constructor stub
		this.loadCapacity=loadCapacity;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Truck";
	}
	
	public double getLoadCapacity() {
		return loadCapacity;
	}

}
