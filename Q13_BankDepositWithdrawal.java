/*
Problem 13: Bank Deposit & Withdrawal
Scenario:
Extend previous problem. Add methods:
● deposit(double amount) → adds to balance
● withdraw(double amount) → subtracts from balance
● Create two accounts, perform deposit/withdraw, display updated balance
*/

class BankAccount
{
	String accountHolder;
	double balance;
	
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
		
}


class Q13_BankDepositWithdrawal
{
	public static void main(String args[])
	{
		BankAccount b1= new BankAccount("Sumit", 110000.20);
		BankAccount b2= new BankAccount("Kanhaiya", 120000.66);
		
		System.out.println("Account Holder Name: "+b1.getAccountHolderName()+ ", Account Balance: "+ b1.getBalance());
		System.out.println("Account Holder Name: "+b2.getAccountHolderName()+ ", Account Balance: "+ b2.getBalance());
				
		b1.deposit(50000);
		b2.withdraw(30000);
		System.out.println();
		
		System.out.println("Account Holder Name: "+b1.getAccountHolderName()+ ", Account Balance: "+ b1.getBalance());
		System.out.println("Account Holder Name: "+b2.getAccountHolderName()+ ", Account Balance: "+ b2.getBalance());
		
		
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q13_BankDepositWithdrawal.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q13_BankDepositWithdrawal
Account Holder Name: Sumit, Account Balance: 110000.2
Account Holder Name: Kanhaiya, Account Balance: 120000.66

Account Holder Name: Sumit, Account Balance: 160000.2
Account Holder Name: Kanhaiya, Account Balance: 90000.66
*/