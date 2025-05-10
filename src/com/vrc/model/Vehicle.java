package com.vrc.model;

public abstract class Vehicle {
        private String id;
        private String brand;
        private String model;
        private double pricePerDay;
        private boolean isAvailable;
        
        public Vehicle(String id,String brand,String model,double pricePerDay) {
        	this.id=id;
        	this.brand=brand;
        	this.model=model;
        	this.pricePerDay=pricePerDay;
        	this.isAvailable=true;
        }
        
        public String getId() {
        	return id;
        }
        
        public String getBrand() {
           return brand;	
        }
        
        public String getModel() {
        	return model;
        }
        public double getPricePerDay() {
        	return pricePerDay;
        }
        
        public boolean isAvailable() {
        	return isAvailable;
        }
        
        public void setAvailable(boolean availabe) {
        	isAvailable=availabe;
        }
        
        public abstract String getType();
        
        public void displayInfo(){
        	System.out.println(getType()+" | "+brand+" "+model+" | Rs."+pricePerDay+"/day | Available: "+isAvailable);
        }
        
        }
