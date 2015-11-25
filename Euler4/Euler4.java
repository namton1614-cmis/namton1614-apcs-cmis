
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
                    String backwardsAB="";
                    for (int i=2; i>=0; i--)
                    { String singleInt = AB.substring(AB.length()-1);
                         backwardsAB += singleInt;
                    }
                        System.out.println(backwardsAB);
                    if (AB.substring(0,1).equals(backwardsAB))
                    {
                        System.out.println(a*b);
                    }
                }
            }

        }
    }

}

