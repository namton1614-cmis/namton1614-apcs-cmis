public class Euler14

{
    public static void main (String arzs [])
    {
        long k = 0;
        long f =0;
        long a=0;
        for (long i =2;i<=1000000;i++)
        {
            int m =1;
            k =i;
            while (k!=1)
            {

                if ( k%2==0 )
                {
                    k = k/2;
                }
                else 
                {
                    k =3*k+1;
                }
                m++;


            }
            if (m>=f)
            {
                f=m;
                a=i;
            }
        }

        System.out.println(f +"\t"+a);
    }

}

