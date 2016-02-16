
public class DoraeMan extends SuperHero
{ 
    private String capeColor;
    public DoraeMan()
    {
      capeColor="Yellow";
    } // end zero-arg constructor SuperHero
    
    public String motto()   
    {
        return "Y u stupid nobita-kun";
    }

    public String toString()
    {
        String output = new String();
        output =  getSuitColor() +"\t" + isCaped() +"\t" +capeColor;
        return output;
    } // end method toString
}