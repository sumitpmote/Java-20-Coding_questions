/*
Problem 8: Bank Account Initialization
Scenario:
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account
has account holder name, balance, and interest rate. Students should practice static blocks for
initialization and setters/getters to modify and access account details.
Tasks:
1. Create a BankAccount class.
2. Use a static block to initialize interest rate to 4%.
3. Create instance variables: name (String) and balance (double).
4. Create setters and getters for name and balance.
5. Print account details including interest rate.
Input Example:
Account1: Name="Rohit", Balance=5000
Account2: Name="Priya", Balance=15000
Expected Output:
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/

class BankAccount
{
	String name;
	double balance;
	static double interestRate;
	
	static
	{
		interestRate = 4.0;
		System.out.println("Bank Interest Rate Initialized: "+ interestRate+ "%");

	}
	BankAccount(String name, double balance)
	{
		this.name=name;
		this.balance= balance;
	}
	void setter(String name, double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	String getName()
	{
		return name;
	}
	double getBalance()
	{
		return balance;
	}
	
}



class Q8_BankAccountInitialization
{
	public static void main(String args[])
	{
		BankAccount b1= new BankAccount("Rohit", 5000.0);
		BankAccount b2= new BankAccount("Priya", 15000.0);
		
		System.out.println("Account1: Name= "+b1.getName()+ ", Balance= "+b1.getBalance()+ ", Interest Rate= "+BankAccount.interestRate+ "%");
		System.out.println("Account2: Name= "+b2.getName()+ ", Balance= "+b2.getBalance()+ ", Interest Rate= "+BankAccount.interestRate+ "%");


	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q8_BankAccountInitialization.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q8_BankAccountInitialization
Bank Interest Rate Initialized: 4.0%
Account1: Name= Rohit, Balance= 5000.0, Interest Rate= 4.0%
Account2: Name= Priya, Balance= 15000.0, Interest Rate= 4.0%
*/