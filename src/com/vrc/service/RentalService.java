package com.vrc.service;

import java.util.List;

import com.vrc.database.VehicleDatabase;
import com.vrc.model.Vehicle;

public class RentalService {

	public List<Vehicle> showAvailableVechiles(){
		return VehicleDatabase.getAllVehciles();
	}
	
	public Vehicle getVehicleDetails(String vechileId) {
		return VehicleDatabase.getVehicleByID(vechileId);
	}
	
	public double rentVehicle(String vehicleId,int days) {
		Vehicle v=VehicleDatabase.getVehicleByID(vehicleId);
		if(v==null) {
			System.out.println("Vehicle not found.");
			return 0;
		}
		double total=v.getPricePerDay()*days;
		System.out.println("You have rented: "+v.getBrand()+" "+v.getModel());
		System.out.println("Total cost for "+days+" days: Rs:"+total);
		return total;
	}
}
