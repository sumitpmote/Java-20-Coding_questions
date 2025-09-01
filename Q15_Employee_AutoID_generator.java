/*
Problem 15: Employee Auto-ID Generator
Scenario:
Create Employee class with id, name, basicSalary.
● Add static counter starting from 1001 for IDs.
● Default constructor → name = "Unknown", salary = 20000
● Parameterized constructor → accept name and salary
● Getter for all variables
● Create 2 employees and display their IDs, names, salary.
*/


class Employee
{
	int id;
	String name;
	int salary;
	static int counter=1000;
	
	Employee()
	{
		counter++;
		this.name= "Unknown";
		this.salary= 20000;
	}
	Employee(String name, int salary)
	{
		this.id= ++counter;
		this.name=name;
		this.salary= salary;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getbasicSalary()
	{
		return salary;
	}	
}


class Q15_Employee_AutoID_generator
{
	public static void main(String args[])
	{
		Employee e1= new Employee("Sumit", 20000);
		Employee e2= new Employee("Karan", 30000);
		Employee e3= new Employee();
		
		System.out.println("Employee1: Id: "+e1.getId()+", Name: "+e1.getName() +", Salary: "+e1.getbasicSalary());
		System.out.println("Employee2: Id: "+e2.getId()+", Name: "+e2.getName() +", Salary: "+e2.getbasicSalary());
		System.out.println("Employee3: Id: "+e3.getId()+", Name: "+e3.getName() +", Salary: "+e3.getbasicSalary());
		
		
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q15_Employee_AutoID_generator.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q15_Employee_AutoID_generator
Employee1: Id: 1001, Name: Sumit, Salary: 20000
Employee2: Id: 1002, Name: Karan, Salary: 30000

*/