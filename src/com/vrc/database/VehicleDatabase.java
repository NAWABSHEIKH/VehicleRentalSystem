package com.vrc.database;

import java.util.ArrayList;
import java.util.List;

import com.vrc.model.Bike;
import com.vrc.model.Car;
import com.vrc.model.Truck;
import com.vrc.model.Vehicle;

public class VehicleDatabase {

	private static List<Vehicle> vehicles=new ArrayList<>();
	static {
		vehicles.add(new Car("C101","Toyota","Fortuner",3000,7));
		vehicles.add(new Car("C102","Honda","City",2000,5));
		vehicles.add(new Bike("B101","Hero","Splendor",500,false));
		vehicles.add(new Bike("B101","Royal Enfienld","Classic 350",800,true));
		vehicles.add(new Truck("T101","Tata","407",5000,3.5));
	}
	
	public static List<Vehicle> getAllVehciles(){
		return vehicles;
	}
	
	public static Vehicle getVehicleByID(String id) {
		for(Vehicle v:vehicles) {
			if(v.getId().equalsIgnoreCase(id)) {
				return v;
			}
		}
		return null;
	}
}
