
public class FactoryDriver
{
    public static void main (String[] args){       
        Factory tesla = new Factory("123 main st", 1);
        
        Car modelS = new Car("Black", 2);
        tesla.addCar( modelS , 0);
        
        System.out.println(tesla);
    }
}
