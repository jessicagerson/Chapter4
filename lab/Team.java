package lab;


public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] players;
    
    public Team(String tnm, int size)
    {
        this.teamName = tnm;
        this.players = new Athlete[size];
    }
    public String toString (){
        String output = "The team " + teamName + " has the following players: \n" ;
        for (Athlete b: players) {
            output += b + "\n";
        }
        return output;
    }
        public void addAthlete(int location, Athlete b){
        players[location] = b;
    }

}
