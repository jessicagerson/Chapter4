package lab;


public class NameDriver
{

    public static void main(String[] args)
    {
        // initialise instance variables
        Name myName = new Name("Jessica", "Anne", "Gerson");
        Name otherName = new Name("Rebecca", "Simone", "Gerson");
        System.out.println(myName);
        System.out.println(otherName);
        
        System.out.println(myName.equals(otherName));

        System.out.println(myName.initials());
        System.out.println(otherName.initials());
        System.out.println(myName.Length());
        System.out.println(otherName.Length());
       
    }

}
