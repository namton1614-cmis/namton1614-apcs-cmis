
public class EvenFibonacci
{
    public static void main (String argvs [] )
    {
        int x = 1;
        int y = 2; 
        int nextterm = 0; 
        int sum = y;
        System.out.println ( x +"\n" +y);
        for ( int index = 0; nextterm < 4000000 ; index++  )//
        {
            System.out.println(  nextterm ); 
            int k =  nextterm%2  ;
            if (k ==1)
            {
                sum += nextterm;
            }
            nextterm = x + y;
            x = y;
            y = nextterm;
        }
        System.out.println( "EVENS SUM:  "+  sum  ); 
    }
}
