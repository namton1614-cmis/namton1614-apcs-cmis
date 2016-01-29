import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Alphabet     {
    public static void main (String argvs [] )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nRow Dimension");
        int row = input.nextInt();
        System.out.println("\nColumn Dimension");
        int col = input.nextInt();
        String [][] grix=new String[row][col];
        System.out.println("\nChoose Array Type");
        int type = input.nextInt();
        int counter=0;
        String []uppercase=  { "A" , "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U" , "V", "X", "Y", "Z"};
        String []lowercase=  { "a" , "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u" , "v", "x", "y", "z"};
        int []zeroNine=  { 0,1,2,3,4,5,6,7,8,9};
        for (int r =0;r<grix.length;r++)
        {
            for (int c=0;c<grix[0].length;c++)
            {

                if (counter==25|| type==3&&counter==10)
                {
                    counter=0;
                }
                if (type==1)
                {
                    grix[r][c]=uppercase[counter];
                }
                if (type==2)
                {
                    grix[r][c]=lowercase[counter];
                }
                if (type==3)
                {
                    grix[r][c]="" +zeroNine[counter];
                }
                counter++;
            }
        }

        for (String [] rowx: grix)
        {
            for (String letter: rowx)
            {
                System.out.print(letter + "\t");
            }
            System.out.println("\n");
        }
    }
} //end class  
