
public class MyCar extends Vehicle implements Connectable, Discountable
{
    private int hpw;

    public  MyCar (int wheel, String color, int hpw)
    {
        super (wheel,color);
        this.hpw=hpw;
    }

    public boolean discount()
    {
        return true;
    }

    public void connectToBluetooth()
    {
        System.out.print("Connecting to bluetooth for a MyCar");
    }

    public String toString()
    {
        return super.toString() +"\nHPW: "+hpw;

    }
}