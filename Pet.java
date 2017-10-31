
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private String breed;
    private static int numPets;



    public Pet(String nm, String brd){
        this.name = nm;
        this.breed = brd;
        numPets++;
    }
    public String getName(){
        return this.name;
    }
        public String getBreed(){
        return this.breed;
    }
    public String toString(){
        return "The pet's name is: " + this.name;
        
    }
    public boolean equals(Pet other){
        if(this.name.equals(other.name)){
           return true; 
        }
        else{
            return false;
        }
    }
    public static void example(){
        System.out.println("This is a static method!");
    }
}

