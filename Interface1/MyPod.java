
public class MyPod extends MyDevice
{
    private String name;
    private boolean power;

    public  MyPod (int memory, String color, String name, boolean power)
    {
        super (memory,color);
        this.name=name;
        this.power = power;
    }

    public boolean getPower()
    {
        return power;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return super.toString() +
        String.format("\nName of Phone: %s\nPotential Unlocked? %s" ,name, power);

    }
}