/*
Problem 10: Student Marks Checker
Scenario:
Create a Student class with rollNo, name, and marks.
● Use a parameterized constructor to initialize all fields.
● Create a getter and setter for marks.
● In main, create one student, update marks using setter, and print student details.
*/

class Student
{
	int rollNo;
	String name;
	int marks;
	
	Student(String name, int rollNo, int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	void setter(int rollNo, String name, int marks)
	{
		this.rollNo= rollNo;
		this.name=name;
		this.marks=marks;
		
	}
	int getRollNo()
	{
		return rollNo;
	}
	String getName()
	{
		return name;
	}
	int getMarks()
	{
		return marks;
	}
}


class Q10_StudentsMarkChecker
{
	public static void main(String args[])
	{
		Student s1=new Student("Sumit", 21, 96);
	
		System.out.println("Student: "+ s1.getName()+", Roll No: "+ s1.getRollNo()+ ", Marks: "+s1.getMarks());
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q10_StudentsMarkChecker.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q10_StudentsMarkChecker
Student: Sumit, Roll No: 21, Marks: 96
*/