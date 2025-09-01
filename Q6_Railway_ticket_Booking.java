/*
Problem 6: Indian Railway Ticket Booking
Scenario:
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and
age or name, age, and seat type. The system should also count the total tickets booked using a static
counter.
Tasks:
1. Create a Passenger class.
2. Implement two constructors (constructor overloading):
Constructor 1 → Passenger(String name, int age)
Constructor 2 → Passenger(String name, int age, String seatType)
3. Use a static counter to keep track of total passengers booked.
4. Print passenger details and total passengers.
Input Example:
Passenger1: "Ravi", 25
Passenger2: "Anita", 30, "AC Sleeper"
Passenger3: "Suresh", 40
Expected Output:
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3
*/

class Passenger
{
	String name;
	int age;
	String seatType;
	static int totalPassengers;
	
	Passenger(String name, int age)
	{
		this.name= name;
		this.age= age;
		
		totalPassengers++;
	}
	
	Passenger(String name, int age, String seatType)
	{
		this.name= name;
		this.age= age;
		this.seatType= seatType;
		
		totalPassengers++;
	}
	
	String showName()
	{
		return name;
	}
	
	int showAge()
	{
		return age;
	}
	String seatType()
	{
		if(seatType== null)
		{
			return "General";
		}
		else
		{	
		return seatType;
		}
	}
	
	static void totalPassengers()
	{
		System.out.println("Total Passengers booked: "+totalPassengers);
	}	
}


class Q6_Railway_ticket_Booking
{
	public static void main(String args[])
	{
		Passenger p1= new Passenger("Ravi", 25);
		Passenger p2= new Passenger("Anita", 30, "AC Sleeper");
		Passenger p3= new Passenger("Suresh", 40);
		
		
		System.out.println("Passenger1: Name: "+p1.showName()+", Age: "+p1.showAge()+", Seat: "+p1.seatType());
		System.out.println("Passenger2: Name: "+p2.showName()+", Age: "+p2.showAge()+", Seat: "+p2.seatType());
		System.out.println("Passenger3: Name: "+p3.showName()+", Age: "+p3.showAge()+", Seat: "+p3.seatType());


		Passenger.totalPassengers();
		
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q6_Railway_ticket_Booking.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q6_Railway_ticket_Booking
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers booked: 3
*/