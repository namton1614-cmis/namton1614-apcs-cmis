
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
                    for (int i=1; i<4; i++)
                    {  int calc = AB.length()+1-i;
                        String singleInt = AB.substring(AB.length()-i,calc);
                        backwardsAB += singleInt;
                    }

                    if (AB.substring(0,3).equals(backwardsAB))
                    {
                        System.out.println(a*b);
                    }
                }
            }

        }
    }

}

