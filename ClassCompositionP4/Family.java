import java.util.ArrayList;
public class Family     {
    public static void main (String argvs [] )
    {
        ArrayList<String> myFamily = new ArrayList<String>(); 
        myFamily.add("Kasidit Thammajinda");
        myFamily.add("Rojana Thammajinda");
        myFamily.add("Tayart Thammajinda");

        System.out.println("Number of family members "+myFamily.size() +"\nFamily members:");
        for (String x : myFamily)
        {
            System.out.println (x);
        }
        for (int i =0;i < myFamily.size(); i++)
        {
                    System.out.println (myFamily.get(i));
        }
    }
} //end class StudentDriver
