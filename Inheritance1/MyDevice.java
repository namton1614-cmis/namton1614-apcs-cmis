import java.util.ArrayList;
public class MyDevice
{
    private int memory;
    private String color;
    public MyDevice()
    {
        memory =4;
        color = new String ("Green");

    } //end constructor  
    public MyDevice( int memory, String color)
    {
        this.memory =memory;
        this.color = color;
    } //end constructor  

    public String toString()
    {
      String output ="\nDevice memory: "+memory +"\nDevice color: "+ color; 
      return output;
    }
}
