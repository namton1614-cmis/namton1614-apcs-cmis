
public class Monster
{

    private int location;

    public Monster()
    {
        location = (int)(Math.random()*1000);
    }

    public int getLocation ()
    {
        return location;

    }

    public String toString()
    {
        String output = String.format(
                "The monster lies dead at %s meters.\n" ,
                location )
        ;
        return output;

    }

}
