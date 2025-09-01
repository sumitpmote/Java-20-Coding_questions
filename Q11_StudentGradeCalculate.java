/*
Problem 11: Student Grade Calculator
Scenario:
Extend previous problem. Add method calculateGrade() which returns:
● "A" if marks ≥ 80
● "B" if marks ≥ 60
● "C" if marks ≥ 40
● "Fail" otherwise
● Create 2 students, print marks and grades.
*/

class Student
{
	String name;
	int rollNo;
	int marks;
	
	Student(String name, int rollNo, int marks)
	{
		this.name=name;
		this.rollNo= rollNo;
		this.marks=marks;
	}
	
	void setter(String name, int rollNo, int marks)
	{
		this.name=name;
		this.rollNo= rollNo;
		this.marks=marks;
	}
	
	String getName()
	{
		return name;
	}
	
	int getRollNo()
	{
		return rollNo;
	}
	
	int getMarks()
	{
		return marks;
	}
	
	static String calculateGrade(int marks)
	{
		if(marks>=80)
		{
			return "A";
		}
		else if(marks>=60)
		{
			return "B";
		}
		else if(marks>=40)
		{
			return "C";
		}
		else
		{
			return "Fail";
		}
	}	
}

class Q11_StudentGradeCalculate
{
	public static void main(String args[])
	{
		Student s1=new Student ("Sumit", 21, 96);
		Student s2= new Student("Aditya", 22, 60);
	
		System.out.println("Student1: Name: "+s1.getName()+ ", Roll No: "+s1.getRollNo()+", Marks: "+s1.getMarks()+", Grades: "+Student.calculateGrade(s1.marks));
		System.out.println("Student2: Name: "+s2.getName()+ ", Roll No: "+s2.getRollNo()+", Marks: "+s2.getMarks()+", Grades: "+Student.calculateGrade(s2.marks));
	
	}
}

/*
OUTPUT:
C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>javac Q11_StudentGradeCalculate.java

C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2>java Q11_StudentGradeCalculate
Student1: Name: Sumit, Roll No: 21, Marks: 96, Grades: A
Student2: Name: Aditya, Roll No: 22, Marks: 60, Grades: B
*/