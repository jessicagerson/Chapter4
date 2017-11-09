package lab;


public class Athlete
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    public Athlete(String nm, int ag)
    {
        this.name = nm;
        this.age = ag;
        
    }
    public String toString(){
        return (name + " who is " + age + " years old.");
    }

}
