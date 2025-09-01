/*
Problem 20: Ticket Booking System
Question:
Create a class Ticket with:
● passengerName (instance)
● ticketNo (instance, auto-generated using a static counter starting from 5001)
● Constructor to accept passengerName
● Method displayTicket() to show ticket details
Task:
Create 3 tickets and display their details.
Sample Input:
Passenger 1: Rahul
Passenger 2: Priya
Passenger 3: Amit
Sample Output:
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit
*/


class Ticket
{
	private String passengerName;
	private int ticketNo;
	private static int counter=5001;
	
	Ticket(String passengerName)
	{
		this.passengerName=passengerName;
		this.ticketNo= counter++;
	}
	
	void displayTicket()
	{
		System.out.println("Ticket No: "+ ticketNo+", Passenger: "+passengerName);
		
	}
}


class Q20_TicketBookingSystem
{
	public static void main(String args[])
	{
		Ticket t1= new Ticket("Rahul");
		Ticket t2= new Ticket("Priya");
		Ticket t3= new Ticket("Amit");
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q20_TicketBookingSystem.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q20_TicketBookingSystem
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit
*/