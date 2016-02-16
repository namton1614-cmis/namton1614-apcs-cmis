
public class AsteriodMan extends SuperHero
{ 
    private String capeColor;
    public AsteriodMan()
    {
      capeColor="Grey";
    } // end zero-arg constructor SuperHero
    
    public String motto()   
    {
        return "Rock Solid";
    }

    public String toString()
    {
        String output = new String();
        output =  getSuitColor() +"\t" + isCaped();
        return output;
    } // end method toString
}
