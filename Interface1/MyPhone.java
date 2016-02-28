
public class MyPhone extends MyDevice 
{
    private String name;
    private boolean power;

    public  MyPhone (int memory, String color, String name, boolean power)
    {
        super (memory,color);
        this.name=name;
        this.power = power;
    }



    public String toString()
    {
        return super.toString() +
        String.format("\nName of Phone: %s\nPotential Unlocked? %s" ,name, power);

    }
}