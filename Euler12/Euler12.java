public class Euler12

{
    public static void main (String arzs [])
    {
        int iSum =0;
        int [] triad = new int [200];    
        int remainder=1;
        for (int i =1;i<200;i++)
        {
            iSum += i;
            triad [i]= iSum;
            System.out.println("\n"+triad [i]);

            for (int s =1;s<200;s++)
            {
                remainder = triad[i]%s;
                if (remainder ==0)
                {
                    System.out.print(" "+  s);
                }

            }

        }

    }
}
