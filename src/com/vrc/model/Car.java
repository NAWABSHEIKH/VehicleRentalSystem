package com.vrc.model;

public class Car extends Vehicle {

	
	private int seats;
	public Car(String id,String brand,String model,double pricePerDay,int seats){
		super(id,brand,model,pricePerDay);
		this.seats=seats;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Car";
	}
	
	public int getSeats() {
		return seats;
	}
}
