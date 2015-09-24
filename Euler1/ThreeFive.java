public class ThreeFive
{
    public static void main (String argvs [] )
    {
        int x = 0;
        int y =0; 
        int z =0;
        for (int r = 1; r < 1000; r++)
        {
            int threemultiples = r % 3;
            int fivemultiples = r % 5;
            int fifteenmultiples = r % 15;            
            if (threemultiples==0)
            {
                x +=  r ;  
            }
            if (fivemultiples==0)
            {
                y += r ;
            }
             if (fifteenmultiples==0)
            {
                z += r ;
            }
            System.out.println(r+ "Y:"+ y  ); 
            System.out.println(r+ "X:"+ x  ); 
            System.out.println(r+ "Z:"+ z  );             
        }
        int sum = x+y-z;
        System.out.println(sum ); 
    }
}