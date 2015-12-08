public class Euler14

{
    public static void main (String arzs [])
    {
        long k = 0;
        int f =0;
        for (int i =999990;i<=1000000;i++)
        {
            int m =0;
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
                System.out.println(k + "\t"+ m);

            }
            if (m>f)
            {
                f=m;
            }
        }

        System.out.println(f);
    }

}

