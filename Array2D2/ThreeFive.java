import java.util.ArrayList;
public class ThreeFive     {
    public static void main (String argvs [] )
    {
        int [][] grix=new int[3][5];
        int increment=1;
        int sum=0;

        for (int r =0;r<grix.length;r++)
        {
            for (int c=0;c<grix[0].length;c++)
            {
                grix[r][c]= increment;
                increment++;
            }
        }

        for (int [] row: grix)
        {
            int rowSum=0;
            for (int num: row)
            {
                rowSum+=num;
                sum += num;
                System.out.print(num + "\t");
            }
            System.out.println("Sum of the RowRow is "+rowSum + "\n");
        }

        for (int c =0;c<grix[0].length;c++)
        {
            int colSum=0;
            for (int r=0;r<grix.length;r++)
            {
                colSum+=grix[r][c];
            }
                            System.out.print(colSum+"\t");
        }
        System.out.println("Total Sum is "+sum + "\n");
    }
} //end class  
