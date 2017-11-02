
public class Car
{
    // instance variables - replace the example below with your own
    private String color;
    private int numDoors;

    public Car(String clr, int nd)
    {
        this.color = clr;
        this.numDoors = nd;
    }
    public String getColor(){
        return this.color;
    }
    public int getDoors(){
        return this.numDoors;
    }
    public String toString(){
        return "This car is " + color + " and has " + numDoors + " doors.";
    }
    
}
