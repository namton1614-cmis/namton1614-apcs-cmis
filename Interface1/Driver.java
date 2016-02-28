import java.util.ArrayList;
public class Driver     {
    public static void main (String argvs [] )
    {
        ArrayList<Connectable> jensen = new ArrayList<Connectable>(); 
        jensen.add(new MyPhone (16, "Blue", "Samsung", true ));
        jensen.add(new MyPod (32, "Orange", "Apple") );
        jensen.add(new MyCar (4, "Crimson", 400) );
        for (Connectable x : jensen)
        {
            System.out.println ("\n"+x.getClass()+x);
        }

        for (Connectable x : jensen)
        {
            x.connectToBluetooth();
        }
    }
} //end class StudentDriver
