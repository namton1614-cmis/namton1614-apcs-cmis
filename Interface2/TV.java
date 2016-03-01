
public abstract class TV 
{
    private boolean tvOn;
    public void tvOn()
    {
        tvOn =true;
    } //end constructor  
    public TV( boolean tvOn)
    {
        this.tvOn =tvOn;
    } //end constructor  
    
    public abstract String tvType();

    public String toString()
    {
      String output ="\nIs TV on? :"+tvOn ; 
      return output;
    }
}
