public class TestBike
{
    Bike b1, b2;

    TestBike()
    {
        // Create the Bike objects:
        Wheel front = new Wheel(1.0);
        Wheel back = new Wheel(1.0);
        b1 = new Bike("White", front, back);

        b1.moveBackward(10.0);
        b1.moveForward(20.0);

        System.out.println("My bike colour is " + b1.getColour());
        b1.setColour("Green");
        System.out.println("My bike colour is " + b1.getColour());

        /*Wheel newfront = new Wheel(2.5);
        b1.setFrontWheel(newfront);
        newfront.moveForward(1000);
         */

        System.out.println(b1.toString());

        /*String colour = b1.getColour(); //call accessor getColour()
        System.out.println(“My bike is currently painted: “ + colour);

        b1.setColour(“Green”); //call mutator setColour()
        System.out.println(“My bike is now painted: “ + b1.getColour());*/









    }
}
