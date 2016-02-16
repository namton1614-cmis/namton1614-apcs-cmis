
public class FriedEggMan extends SuperHero
{ 
    public FriedEggMan()
    {
      setSuitColor("Yellow");
      setCape(true);
    } // end zero-arg constructor SuperHero
    
    public String motto()   
    {
        return "Use the bamboo copter!";
    }

    public String toString()
    {
        String output = new String();
        output ="FriedEggMan\t"+  getSuitColor() +"\t" + isCaped() +"\t"+motto();
        return output;
    } // end method toString
}