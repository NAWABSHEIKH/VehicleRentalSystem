package com.vrc.main;

import java.util.List;
import java.util.Scanner;

import com.vrc.model.Vehicle;
import com.vrc.service.RentalService;

public class VehileRentalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		RentalService rentalService=new RentalService();
		System.out.println("=== Welcome to Vehicle Rental System ===");
		
		List<Vehicle> vehicles=rentalService.showAvailableVechiles();
		System.out.println("\nAvailable Vehicles: ");
		
		for(Vehicle v:vehicles) {
			System.out.println(v.getId()+" - "+v.getBrand()+" "+v.getModel());
		}
		
		System.out.println("\nEnter Vehicle ID to rent: ");
		String selectedId=ab.nextLine();
		
		Vehicle selectedVehicle=rentalService.getVehicleDetails(selectedId);
		if(selectedVehicle==null) {
			System.out.println("Invalid Vehicle ID!");
			return;
		}
		
		System.out.println("Enter number of days to rent: ");
		int days=ab.nextInt();
		
		rentalService.rentVehicle(selectedId, days);
		System.out.println("=== Thank you for using our service! ===");
		ab.close();

	}

}
