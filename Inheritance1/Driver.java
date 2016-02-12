import java.util.ArrayList;
public class Driver     {
    public static void main (String argvs [] )
    {
        ArrayList<MyDevice> device = new ArrayList<MyDevice>(); 
        device.add(new MyDevice (16, "Teal") );
        device.add(new MyDevice (32, "Orange") );
        device.add(new MyDevice (64, "Crimson") );
                device.add(new SVG (64, "Crimson", "Savage", true) );
        for (MyDevice x : device)
        {
            System.out.println (x);
        }
    }
} //end class StudentDriver
