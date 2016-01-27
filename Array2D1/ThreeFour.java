import java.util.ArrayList;
public class ThreeFour     {
    public static void main (String argvs [] )
    {
        int [][] grix=new int[50][50];

        for (int r =0;r<grix.length;r++)
        {
            for (int c=0;c<grix[0].length;c++)
            {
                grix[r][c]=(int)(Math.random()*10);
                System.out.print(grix[r][c]+" ");
            }
            System.out.println( "\n");
        }
    }
} //end class  
