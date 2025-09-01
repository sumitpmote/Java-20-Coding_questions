/*
Problem 2: Simple Mobile Tracker
Scenario: A shop wants to count how many mobiles are added to their inventory.
Requirements:
1. Create a class Mobile with instance variable: model (String).
2. Create a static variable totalMobiles to count total mobiles added.
3. Constructor should initialize model and increment totalMobiles.
4. Create a getter for model.
5. Create a static method showTotalMobiles() to print total mobiles.
Input Example:
Mobile1: model = "Samsung Galaxy M32"
Mobile2: model = "Redmi Note 12"
Expected Output:
Mobile1 model: Samsung Galaxy M32
Mobile2 model: Redmi Note 12
Total mobiles in stock: 2
*/

class Mobile
{
	String model;
	static int totalMobiles;
	
	Mobile(String model)
	{
		this.model= model;
		totalMobiles++;
	}
	
	String getter()
	{
		return model;
	}
	
	static void showTotalMobiles()
	{
		System.out.println("Total mobiles in stock: "+totalMobiles);
	}
}


class Q2_MobileCountStore
{
	public static void main(String main[])
	{
		Mobile m1= new Mobile("Samsung Galaxy M32");
		Mobile m2= new Mobile("Redmi Note 12");
		
		System.out.println("Mobile1 model= "+m1.getter());
		System.out.println("Mobile2 model: "+m2.getter());
		
		Mobile.showTotalMobiles();
		
		
		
		
	}
}

/*
OUTPUT:
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> javac Q2_MobileCountStore.java
PS C:\Users\sumit\OneDrive\Desktop\CDAC\Java\code\Assignment 2> java Q2_MobileCountStore
Mobile1 model= Samsung Galaxy M32
Mobile2 model: Redmi Note 12
Total mobiles in stock: 2
*/