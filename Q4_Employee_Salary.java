/*
Problem 4: Employee Salary Manager
Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees
who have worked more than 5 years.
Requirements:
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService
(int).
2. Create static variable totalEmployees to store the number of employees created.
3. Constructor should initialize all instance variables and increment totalEmployees.
4. Create getters and setters for all instance variables.
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0.
6. Create a static method showTotalEmployees() to print total employees created.
7. Write a main class to create 3 employees, print their bonuses, and print total employees.
Input Example:
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5
Expected Output:
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3
*/


class Employee
{
	String name;
	double salary;
	int yearsOfService;
	static int totalEmployees;

	Employee(String name, double salary, int yearsOfService)
	{
		this.name=name;
		this.salary=salary;
		this.yearsOfService=yearsOfService;
		
		totalEmployees++;
	}

	void setData(String name, double salary, int yearsOfService)
	{
		this.name=name;
		this.salary=salary;
		this.yearsOfService=yearsOfService;
	}

	String getName()
	{
		return name;
	}

	double getSalary()
	{
		return salary;
	}

	int getYearsOfService()
	{
		return yearsOfService;
	}


	double calculateBonus()
	{
		if(yearsOfService>5)
		{
			double bonus= (salary*5)/100;
			return bonus;
		}
		else
		{
			return 0.0;
		}
	}

	static void showTotalEmployees()
	{
		System.out.println("Total employees: "+totalEmployees);
	}
}





class Q4_Employee_Salary
{
	public static void main(String args[])
	{
		Employee e1= new Employee("Ravi", 150000, 6);
		Employee e2= new Employee("Anita", 120000, 3);
		Employee e3= new Employee("Suresh", 100000, 5);
		
		
		System.out.println("Employee Ravi Bonus: "+e1.calculateBonus());
		System.out.println("Employee Anita Bonus: "+e2.calculateBonus());
		System.out.println("Employee Suresh Bonus: "+e3.calculateBonus());
		
		Employee.showTotalEmployees();
		
		
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> javac Q4_Employee_Salary.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> java Q4_Employee_Salary
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3
*/