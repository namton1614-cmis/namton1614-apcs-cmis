
public class Euler4
{
    
    public static void main (String arms [])
    {
        for ( int a=100;a <999;a++)
        {
            for ( int b=100;b <999;b++)
            {
                int ab=a*b;
                String AB= ""+ab; 
                if (ab>100000)
                {
                    if (AB.substring(0,2).equals(AB.substring(4,6)))
                    {
                        System.out.println(a*b);
                    }
                }
            }

        }
    }

}

