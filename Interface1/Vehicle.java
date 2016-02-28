
public abstract class Vehicle 
{
    private int wheel;
    private String color;
    public Vehicle()
    {
        wheel =4;
        color = new String ("Teal");
    } //end constructor  
    public Vehicle( int wheel, String color)
    {
        this.wheel =wheel;
        this.color = color;
    } //end constructor  

    public String toString()
    {
      String output ="\nNumber of wheels: "+wheel +"\nColor: "+ color; 
      return output;
    }
}
