package lab;


public class SoccerDriver
{
    // instance variables - replace the example below with your own
     public static void main(String[] args) {
        //Create a library object
        Team t = new Team("Acalanes Dons", 7);
        
        Athlete parker = new Athlete("Parker", 18);
        t.addAthlete(0, parker);
        Athlete jess = new Athlete("Jess", 17);
        t.addAthlete(1, jess);
        Athlete sam = new Athlete("Sam", 17);
        t.addAthlete(2, sam);
        Athlete maddie = new Athlete("Maddie", 14);
        t.addAthlete(3, maddie);
        Athlete jake = new Athlete("Jake", 16);
        t.addAthlete(4, jake);
        Athlete mrappel = new Athlete("Mr. Appel", 32);
        t.addAthlete(5, mrappel);
        Athlete mom = new Athlete("Mom", 56);
        t.addAthlete(6, mom);
        System.out.println(t);
    }
    
}
