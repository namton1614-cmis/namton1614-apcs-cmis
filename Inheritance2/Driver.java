import java.util.ArrayList;
public class Driver     {
    public static void main (String argvs [] )
    {
        ArrayList<Television> cat = new ArrayList<Television>(); 
        cat.add(new Television ("Mitsubishi", 39.99) );
        cat.add(new LED ("Samsung", 34.99) );
        cat.add(new LCD ("Panasonic", 44.99) );
        cat.add(new Plasma ("Toshiba", 49.99) );
        cat.add(new DLP ("Phillips", 32.99) );
        for (Television x : cat)
        {
            System.out.println (x);
        }
    }
} //end class StudentDriver
