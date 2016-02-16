
public class DoraeMan extends SuperHero
{ 
    public DoraeMan()
    {
      setSuitColor("Blue");
            setCape(false);
    } // end zero-arg constructor SuperHero
    
    public String motto()   
    {
        return "Go through the dokodemo door!";
    }

    public String toString()
    {
        String output = new String();
        output = "DoraeMan\t"+ getSuitColor() +"\t" + isCaped() + "\t"+motto();
        return output;
    } // end method toString
}