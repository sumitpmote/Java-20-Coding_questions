/*
Problem 18: Vehicle Registration – Static Counter
Scenario:
Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
● Create 2 vehicles, display registration details
*/

class Vehicle
{
	private String regNo;
	private String ownerName;
	private String vehicleType;
	static int vehicleCount=0;
	
	Vehicle(String ownerName, String vehicleType)
	{
		vehicleCount++;

		this.regNo= "MH-2025-"+vehicleCount;;
		this.ownerName=ownerName;
		this.vehicleType= vehicleType;
		
	}
	
	String getRegNo()
	{
		return regNo;
	}
	
	String getOwnerName()
	{
		return ownerName;
	}
	
	String getVehicleType()
	{
		return vehicleType;
	}
}


class Q18_Vehicle_Registration
{
	public static void main(String args[])
	{
		Vehicle v1= new Vehicle("Sumit", "Car");
		Vehicle v2= new Vehicle("Karan", "Bike");
		
		System.out.println("Registration No: "+v1.getRegNo()+", Owner: "+v1.getOwnerName()+", Vehicle Type: "+v1.getVehicleType());
		System.out.println("Registration No: "+v2.getRegNo()+", Owner: "+v2.getOwnerName()+", Vehicle Type: "+v2.getVehicleType());

	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q18_Vehicle_Registration.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q18_Vehicle_Registration
Registration No: MH-2025-1, Owner: Sumit, Vehicle Type: Car
Registration No: MH-2025-2, Owner: Karan, Vehicle Type: Bike
*/