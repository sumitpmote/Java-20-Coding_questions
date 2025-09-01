/*
Problem 17: Library Book Addition
Scenario:
Create Book class with bookId, title, author.
● Constructor + Getters/Setters
● Create Library class with libraryName and static totalBooks
● Method addBook(Book b) → increments totalBooks
● Method displayTotalBooks() → prints totalBooks
● Add 2 books to library and display total books
*/

class Book
{
	private int bookId;
	private String title;
	private String author;


	Book(int bookId, String title, String author)
	{
		this.bookId= bookId;
		this.title= title;
		this.author= author;
		
	}
	void setters(int bookId, String title, String author)
	{
		this.bookId= bookId;
		this.title= title;
		this.author= author;
	}

	int getBookId()
	{
		return bookId;
	}

	String getTitle()
	{
		return title;
	}

	String getAuthor()
	{
		return author;
	}
}


class Library
{
	String libraryName;
	static int totalBooks;
	
	void addBook(Book b)
	{
		totalBooks++;
	}
	
	static void displayTotalBooks()
	{
		System.out.println("Total Books: "+totalBooks);
	}
}




class Q17_Library_Book_Addition
{
	public static void main(String args[])
	{
		Book b1= new Book(1011,"Rich Dad Poor Dad", "Samuel Martin");
		Book b2= new Book(1012, "Harry Potter", "Henry christopher");
		
		System.out.println("Book Id: "+b1.getBookId()+ ", Book title: "+b1.getTitle()+", "+b1.getAuthor());
		System.out.println("Book Id: "+b2.getBookId()+ ", Book title: "+b2.getTitle()+", "+b2.getAuthor());
		
		Library lib= new Library();
		lib.addBook(b1);
		lib.addBook(b2);
		lib.displayTotalBooks();


	}	
}