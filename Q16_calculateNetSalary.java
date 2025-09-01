/*
Problem 16: Employee Net Salary
Scenario:
Extend previous problem. Add method calculateNetSalary():
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
● Print net salary for 2 employees
*/

class Employee
{
	int id;
	String name;
	int salary;
	static int counter=1000;
	
	Employee()
	{
		this.id=++counter;
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
	
	int calculateNetSalary()
	{
		
		int HRA = (10*salary)/100;
		int DA= (5*salary)/100;
		int PF= (2*salary)/100;
		
		int netSalary= salary+HRA+DA-PF;
		return netSalary;
	}
}


class Q16_calculateNetSalary
{
	public static void main(String args[])
	{
		Employee e1= new Employee("Sumit", 20000);
		Employee e2= new Employee("Karan", 25000);
		Employee e3= new Employee();
		
		
		System.out.println("Employee1: Id: "+e1.getId()+", Name: "+e1.getName() +", Basic Salary: "+e1.getbasicSalary()+ ", Net Salary: "+e1.calculateNetSalary());
		System.out.println("Employee2: Id: "+e2.getId()+", Name: "+e2.getName() +", Basic Salary: "+e2.getbasicSalary()+", Net Salary: "+e2.calculateNetSalary());
		System.out.println("Employee3: Id: "+e3.getId()+", Name: "+e3.getName() +", Basic Salary: "+e3.getbasicSalary()+ ", Net Salary: "+ e3.calculateNetSalary());
		
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q16_calculateNetSalary.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q16_calculateNetSalary
Employee1: Id: 1001, Name: Sumit, Basic Salary: 20000, Net Salary: 22600
Employee2: Id: 1002, Name: Karan, Basic Salary: 25000, Net Salary: 28250
Employee3: Id: 1003, Name: Unknown, Basic Salary: 20000, Net Salary: 22600
*/