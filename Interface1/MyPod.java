
public class MyPod extends MyDevice implements Discountable
{
    private String name;

    public  MyPod (int memory, String color, String name)
    {
        super (memory,color);
        this.name=name;

    }

    public boolean discount()
    {
        return true;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return super.toString() +
        String.format("\nName of Phone: %s\n" ,name);

    }
}