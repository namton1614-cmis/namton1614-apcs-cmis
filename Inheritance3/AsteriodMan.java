
public class AsteriodMan extends SuperHero
{ 
    public AsteriodMan()
    {
        setSuitColor("Grey");
        setCape(true);
    } // end zero-arg constructor SuperHero

    public String motto()   
    {
        return "Eat the translation jelly!";
    }

    public String toString()
    {
        String output = new String();
        output ="AsteroidMan\t"+  getSuitColor() +"\t" + isCaped() + "\t"+motto();
        return output;
    } // end method toString
}
