
public class EvenFibonacci
{
    public static void main (String argvs [] )
    {
        int x = 1;
        int y = 2;
        int [] fibonacci = new int [30]; 
        int sum = y;
        System.out.println ( x +"\n" +y);
        for ( int index = 0; index < fibonacci.length; index++ )
        {
            fibonacci [index] = x + y;
            x = y;
            y = fibonacci [index];
            System.out.println(  fibonacci [index]  ); 
            int k =  fibonacci[index]%2  ;
            if (k ==1)
            {
               sum += fibonacci [index];
            }
        }
        System.out.println( "EVENS SUM:  "+  sum  ); 
    }
}
