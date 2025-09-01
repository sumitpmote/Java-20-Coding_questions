/*
Problem 14: Bank Name Display
Scenario:
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to
BankAccount.
● Call displayBankName() from main.
● Create one account to verify instance creation.
*/
class BankAccount
{
	String accountHolder;
	double balance;
	static String bankName= "CDAC Bank";
	
	
	
	BankAccount(String accountHolder, double balance)
	{
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	void setter(String accountHolder, double balance)
	{
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	String getAccountHolderName()
	{
		return accountHolder;
	}
	Double getBalance()
	{
		return balance;
	}
	
	void deposit(double amount)
	{
		balance = balance+amount;
	}
	
	void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance= balance-amount;
		}
		else
		{
			System.out.println("Insufficient balance!!");
		}
	}
	
	static void displayBankNAme()
	{
		System.out.println("Bank Name: "+bankName);
	}
		
}


class Q14_BankNameDisplay
{
	public static void main(String args[])
	{
		
		BankAccount b1= new BankAccount("Sumit", 110000.20);
		BankAccount.displayBankNAme();
		
		System.out.println("Account Holder Name: "+b1.getAccountHolderName()+ ", Account Balance: "+ b1.getBalance());
		
		
	}
}

/*
OUTPUT:

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q14_BankNameDisplay.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q14_BankNameDisplay
Bank Name: CDAC Bank
Account Holder Name: Sumit, Account Balance: 110000.2
*/