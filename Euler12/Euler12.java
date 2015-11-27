public class Euler12

{
    public static void main (String arzs [])
    {
        int iSum =0;
        int [] triad = new int [10000];    
        int remainder=1;
        int mk=0;
        for (int i =1;i<10000;i++)
        {
            iSum += i;
            triad [i]= iSum;
            System.out.println("\n"+triad [i]);
            int KLMX=0;
            for (int s =1;s<triad[i];s++)
            {
                remainder = triad[i]%s;

                if (remainder ==0)
                {
                    KLMX+=1;
                    System.out.print(" "+  s);
                }
                if (KLMX ==500)
                {
                    mk=triad[i];
                    i=9999;
                }
            }

        }
        System.out.println("\n"+mk);
    }
}
