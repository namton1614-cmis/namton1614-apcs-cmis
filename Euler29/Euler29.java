public class Euler29

{
    public static void main (String arzs [])
    {
        long c=0;

        for ( int a =2;a<=100;a++)
        {
            c=a;
            for ( int b =2;b<=100;b++)
            {
                c*=a;
                System.out.println(c);
            }
        }

    }
}
