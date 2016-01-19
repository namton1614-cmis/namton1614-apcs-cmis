import java.util.ArrayList;
public class Family     {
    public static void main (String argvs [] )
    {
        ArrayList<String> myFamily = new ArrayList<String>(); 
        myFamily.add("Kasidit Thammajinda");
        myFamily.add("Rojana Thammajinda");
        myFamily.add("Tayart Thammajinda");

        System.out.println(myFamily.size());
        for (String x : myFamily)
        {
            System.out.println (x);
        }
    }
} //end class StudentDriver
