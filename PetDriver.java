
public class PetDriver
{
    // instance variables - replace the example below with your own

    public static void main() 
    {
        // initialise instance variables
        
        Pet remi = new Pet("Remi", "dog");
        System.out.println(remi.getName());
        
        Pet mike = new Pet("Mike", "cat");
        System.out.println(remi.equals(mike));
        
        Pet.example();
        
    }


}
