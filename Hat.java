
public class Hat
{
    // instance variables - replace the example below with your own
    private String color;
    private String size;

    public Hat(String clr, String sz)
    {
        this.color = clr;
        this.size = sz;
    }
        public String getColor(){
        return this.color;
    }
        public String getSize(){
        return this.size;
    }
    public String toString(){
        return "The color of this hat is: " + this.color + " The size is: " + this.size;
        
    }

}
