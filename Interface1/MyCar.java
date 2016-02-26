
public class MyCar extends Vehicle implements Connectable
{
    private String name;

    public  MyCar (int memory, String color, String name)
    {
        super (memory,color);
        this.name=name;

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