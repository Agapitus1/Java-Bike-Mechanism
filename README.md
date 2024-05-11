# Java-Bike-Mechanism

In class Bike there are 3 methods:
	public  Bike()
	private displayColour()
	public moveForward()
	
There are also 3 class attributes
These are all  private



Class attributes should ALWAYS be declared private rather than public
If nothing is stated the visibility is package level (as we have been using so far this semester)

 private String colour;
 private Wheel frontWheel;
 private Wheel backWheel;


	public Bike()
	This is public so that any other class can call it, so we can create many Bike objects

	private displayColour()
	This is private so that only the Bike class is allowed to use it


If we declare the position attribute in class Wheel as public instead of private we could do this in the Bike class:
	frontWheel.position = -5000;
This could allow invalid values to be assigned to the position attribute.
By declaring position as private, the above statement is not allowed, therefore protecting the data inside the Wheel class
The same applies to private methods


Anywhere we want to access a class attribute from outside the class, we use an accessor method
Example: if we want to access the colour of the Bike in another class we would say:

String colour = myBike.getColour();
OR
System.out.print(“My bike is currently: “ + myBike.getColour());

In the method 
	setFrontWheel(Wheel front) 
	we passed a Wheel object to the method
This is common, but we must be aware that a copy of the object is NOT created, it is the ONLY copy of the object
This is called “pass by reference”
Any change made to the object is permanent


Example in class Bike:
public String toString()
{
	return “Colour = “ + colour + “, front wheel position is = “ + frontWheel.getPosition() + “, back wheel position is = “ + backWheel.getPosition();
}

	Result: Colour = Red, front wheel position = 5, back wheel position = 5




public class Bike
{
  private String colour;
  private Wheel frontWheel;
	private Wheel backWheel;
  public Bike()
  {        
  }    
  public void displayColour()
  {
    System.out.println("The bike is “ + colour);    
  }
}


public class Wheel
{
  private double position;
	public Wheel(double thePosition)
  {  
			position = thePosition;      
  }
	public void moveForward(double distance)
	{
	}    
}



