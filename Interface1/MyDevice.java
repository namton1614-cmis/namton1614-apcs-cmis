import java.util.ArrayList;
public abstract class MyDevice implements Connectable
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
    public void connectToBluetooth()
    {
       System.out.println("Connection established for this Device");
    }

    public String toString()
    {
        String output ="\nDevice memory: "+memory +"\nDevice color: "+ color; 
        return output;
    }
}
