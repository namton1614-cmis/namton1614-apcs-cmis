
public class MySong
{
    private int rating;
    private String name;
    public MySong()
    {
        name = new String ("Siegfried-Idyll");

    } //end constructor Song
    public MySong (String name, int rating)
    {
        this.name = new String (name);
        this.rating = rating;

    }
    public String getName()
    {
       return name; 
    
    }
    public String toString( )
    {
        String output = new String();
        output =  "" + name + " "+rating ;
        return output;
    }
}
