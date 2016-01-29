import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class MrMultiply     {
    public static void main (String argvs [] )
    {

        Scanner input = new Scanner(System.in);
        System.out.println("\nRow Dimension");
        int row = input.nextInt();
        System.out.println("\nColumn Dimension");
        int col = input.nextInt();
        int [][] grix=new int[row][col];

        for (int r =0;r<grix.length;r++)
        {
            for (int c=0;c<grix[0].length;c++)
            {
                if (c==0 || r==0)
                {
                    grix[r][c]= c; 
                }
                else

                    grix[r][c]= r*c;

            }
        }

        for (int [] rowx: grix)
        {

            for (int num: rowx)
            {

                System.out.print(num + "\t");
            }
            System.out.println("\n");
        }
    }
} //end class  
