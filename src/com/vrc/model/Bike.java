package com.vrc.model;

public class Bike extends Vehicle{

	private boolean isGeared;
	public Bike(String id, String brand, String model, double pricePerDay,boolean isGeared) {
		super(id, brand, model, pricePerDay);
		// TODO Auto-generated constructor stub
		this.isGeared=isGeared;;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bike";
	}
	
	public boolean isGeared() {
		return isGeared;
	}

}
