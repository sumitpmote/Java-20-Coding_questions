/*
Problem 12: Bank Account Basic Info
Scenario:
Create BankAccount class with accountHolder and balance.
● Use parameterized constructor to initialize account.
● Create getter and setter for balance.
● In main, create one account and display details.
*/

class BankAccount
{
	String accountHolder;
	double balance;

	BankAccount(String accountHolder, double balance)
	{
		this.accountHolder= accountHolder;
		this.balance= balance;
	}
	
	void setter(String accountHolder, double balance)
	{
		this.accountHolder=accountHolder;
		this.balance= balance;
	}
	
	String getAccountHolder()
	{
		return accountHolder;
	}
	
	double getBalance()
	{
		return balance;
	}
}
	
class Q12_BankAccountInfo
{
	public static void main(String args[])
	{
		BankAccount b1= new BankAccount("Sumit Prabhakar Mote", 278050.60);
			
		System.out.println("Account Holder Name: "+b1.getAccountHolder()+ ", Account Balance: "+ b1.getBalance());
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q12_BankAccountInfo.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q12_BankAccountInfo
Account Holder Name: Sumit Prabhakar Mote, Account Balance: 278050.6
*/