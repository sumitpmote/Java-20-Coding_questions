/*
Problem 3: Library Book Tracker
Scenario: A library in Delhi wants to track how many books are issued in total and details of each book.
Requirements:
1. Create a Book class with instance variables: title (String), author (String), issued (boolean).
2. Create static variable totalIssuedBooks to keep track of the total number of books issued.
3. Create a constructor to initialize the book details.
4. Create getters and setters for all instance variables.
5. Create a static method showTotalIssued() to print total issued books.
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued
books.
Input Example:
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true
Expected Output:
Book1 issued? true
Book2 issued? false
Book3 issued? true
Total books issued: 2
Problem 4: Employee
*/


class Book
{
	String title;
	String author;
	boolean issued;
	static int totalIssuedBooks;
	
	Book(String title, String author, boolean issued)
	{
		this.title= title;
		this.author= author;
		this.issued= issued;
		
		if (issued)
		{
			totalIssuedBooks++;
		}
	}
	
	void setDetails(String title, String author, boolean issued)
	{
		this.title=title;
		this.author=author;
		this.issued= issued;
	}
	
	String getTitle()
	{
		return title;
	}
	
	String getAuthor()
	{
		return author;
	}
	
	boolean getIssued()
	{
		return issued;		
	}
	
	static void showTotalIssued()
	{
		System.out.print("Total books issued: "+totalIssuedBooks);
	}
}



class Q3_LibraryBookTracker
{
	public static void main(String args[])
	{
		Book b1= new Book("Harry Potter", "J.K. Rowling", true);
		Book b2= new Book("Five Point Someone", "Chetan Bhagat", false);
		Book b3= new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);
		
		System.out.println("Book1 issued?"+ b1.getIssued());
		System.out.println("Book2 issued?"+ b2.getIssued());
		System.out.println("Book3 issued?"+ b3.getIssued());
		
		Book.showTotalIssued();
	}
}


/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> javac Q3_LibraryBookTracker.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> java Q3_LibraryBookTracker
Book1 issued?true
Book2 issued?false
Book3 issued?true
Total books issued: 2
*/