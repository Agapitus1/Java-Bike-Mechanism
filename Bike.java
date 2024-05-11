public class Bike
{
    private String colour;
    private Wheel frontWheel;
    private Wheel backWheel;

    // Constant for the number of wheels
    final int NUM_WHEELS = 2;

    public Bike(String theColour, Wheel theFrontWheel, Wheel theBackWheel)                                            
    {  
        colour = theColour;
        frontWheel = theFrontWheel;
        backWheel = theBackWheel;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String theColour)
    {
        colour = theColour;
    }

    public void setFrontWheel(Wheel front)
    {
        frontWheel = front;
    }
    private void displayColour()
    {
        System.out.println("The bike is " + colour);    
    }

    public void moveForward(double distance)
    {
        frontWheel.moveForward(distance);
        backWheel.moveForward(distance);
    }

    void moveBackward(double distance)
    {
        frontWheel.moveBackward(distance);
        backWheel.moveBackward(distance);
    }

    // moveBackwards method

    public String toString()
    {
        return ("Colour = " + colour + ", front wheel " + frontWheel.toString() + ", back wheel = " + backWheel.toString());
    }

}
