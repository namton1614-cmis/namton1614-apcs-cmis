
/**
 * Write a description of class gdg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Euler5

{
    public static void main (String arms [])
    {
        int genos =10;
        int big =0;
        while (genos !=0)
        {
            big+=20;
            genos =0;
            for (int i =1;i<=20;i++)
            {
                genos+= (big % i);
            }
            System.out.println(big);
        }
        System.out.println(big);
    }

}

