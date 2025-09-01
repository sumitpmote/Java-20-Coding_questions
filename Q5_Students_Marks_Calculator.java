/*
Problem 5: Student Marks Calculator
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in
the class.
Requirements:
1. Create a class Student with instance variables: name (String), marks (int).
2. Create static variable totalStudents to count total number of students.
3. Constructor to initialize student details and increment totalStudents.
4. Getter and Setter for marks.
5. Method isPassed() returns true if marks >= 35, false otherwise.
6. Static method showTotalStudents() prints total students.
7. In main class, create 3 students, check if they passed, and show total students.
Input Example:
Student1: Name: "Rahul", Marks: 78
Student2: Name: "Pooja", Marks: 34
Student3: Name: "Amit", Marks: 65
Expected Output:
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total students: 3
*/

class Student
{
	private String name;
	private int marks;
	private static int totalStudents;
	
	Student(String name, int marks)
	{
		this.name=name;
		this.marks=marks;

		totalStudents++;
	}
	
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	int getMarks()
	{
		return marks;
	}
	
	boolean isPassed()
	{
		if(marks>=35)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static void showTotalStudents()
	{
		System.out.println("Total students: "+totalStudents);
	}
}


class Q5_Students_Marks_Calculator
{
	public static void main(String args[])
	{
		Student s1= new Student("Rahul", 78);
		Student s2= new Student("Pooja", 34);
		Student s3= new Student("Amit", 65);
		
		System.out.println("Student Rahul Passed? "+s1.isPassed());
		System.out.println("Student Pooja Passed? "+s2.isPassed());
		System.out.println("Student Amit Passed? "+s3.isPassed());
		
		Student.showTotalStudents();
	}	
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> javac Q5_Students_Marks_Calculator.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> java Q5_Students_Marks_Calculator
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total students: 3
*/