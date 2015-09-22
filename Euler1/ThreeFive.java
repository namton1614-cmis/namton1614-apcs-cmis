
public class ThreeFive
{
    public static void main (String argvs [] )
    {
        int max = 0;
        int x = 0;
        int y = 0;
        for (int r = 1; r < 1000; r++)
        {
            int k = r % 3;
            int v = r % 5;
            if (k==0)
            {
                x +=  r ;  
            }
            if (v==0)
            {
                y += r ;
            }
            System.out.println(r+ ":"+ y  ); 
            System.out.println(r+ ":"+ x  ); 
        }
        int sum = x+y;
        System.out.println(sum ); 
    }
}
