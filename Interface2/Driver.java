import java.util.ArrayList;
public class Driver     {
    public static void main (String argvs [] )
    {
        ArrayList<TV> jensen = new ArrayList<TV>(); 
        jensen.add(new BWTV (false));
        jensen.add(new HDTV (false ));
        for (TV x : jensen)
        {
            System.out.println (x+" "+x.tvType() );
        }

        for (int i=0;i<jensen.size();i++)
        {
            jensen.get(i).tvOn();
        }
        System.out.println ("\n");
        for (TV x : jensen)
        {
            System.out.println (x+"\t"+x.tvType() );
        }
        System.out.println ("\n");
        BWTV bwtv = (BWTV)jensen.get(0);
        HDTV hdtv = (HDTV)jensen.get(1);
        System.out.println (bwtv.rotateRabbitEars());
        System.out.println (hdtv.connectHDMI());
    }
} //end class StudentDriver
