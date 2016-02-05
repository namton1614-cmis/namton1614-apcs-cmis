import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class testo     {
    public static void main (String argvs [] )
    {
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        int []colSum= new int [10];
        int []rowSum= new int [10];
        int bigCol=0;
        int bigRow=0;
        int rowFind=0;
        int colFind=0;
        int coordinate=0;
        for (int c =0;c<grid[0].length;c++)
        {
            for (int r=0;r<grid.length;r++)
            {
                colSum[c]+=grid[r][c];
            }
        }
        for (int r =0;r<grid.length;r++)
        {
            for (int c=0;c<grid[0].length;c++)
            {
                rowSum[r]+= grid[r][c];
            }
        }
        for (int i=0;i<colSum.length;i++)
        {
            if (bigCol<colSum[i])
            {
                bigCol=colSum[i];
                colFind=i;
            }

        }
        for (int i=0;i<rowSum.length;i++)
        {
            if (bigRow<rowSum[i])
            {
                bigRow=rowSum[i];
                rowFind=i;
            }
        }

        coordinate=grid[rowFind][colFind];

        for (int [] rowx: grid)
        {
            for (int num: rowx)
            {
                System.out.print(num +" ");
            }
            System.out.println();
        }
        for (int r =0;r<grid.length;r++)
        {
            for (int c=0;c<grid[0].length;c++)
            {
                if (grid[r][c]==coordinate)
                {
                    grid[r][c]=0;
                }
                else if (grid[r][c]==0)
                {
                    grid[r][c]=coordinate;
                }
            }
        }
                    System.out.println(rowFind+" "+colFind);
        for (int [] rowx: grid)
        {
            for (int num: rowx)
            {
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
} //end class  
