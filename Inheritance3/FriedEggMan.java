
public class FriedEggMan extends SuperHero
{ 
    private String capeColor;
    public FriedEggMan()
    {
      capeColor="Yellow";
    } // end zero-arg constructor SuperHero
    
    public String motto()   
    {
        return "Whyyyyyyyyyyyyyy";
    }

    public String toString()
    {
        String output = new String();
        output =  getSuitColor() +"\t" + isCaped();
        return output;
    } // end method toString
}