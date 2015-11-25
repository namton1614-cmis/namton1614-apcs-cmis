public class Euler9

{
    public static void main (String arzs [])

    {
        int abcProduct=0;
        for (int a =1;a<=1000;a++)
        {
            for (int b =1;b<=1000;b++)
            {        for (int c =1;c<=1000;c++)
                {
                    if ( (a*a) +(b*b) == (c*c))
                    {
                        System.out.println(a + "\t" + b+"\t"+c + "\t"+ (a + b+c));
                        if (a+b+c==1000)
                        {
                            abcProduct=a*b*c;
                        }
                    }
                }
            }}
        System.out.println(abcProduct);
    }

}

