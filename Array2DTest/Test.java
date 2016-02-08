import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Test     {
    public static void main (String argvs [] )
    {
        int[][] grid = new int[][] {
                {9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        int []colProduct= new int [grid[0].length];
        int []rowProduct= new int [grid.length];
        for (int i=0;i<colProduct.length;i++)
        {
            colProduct[i]=1;
        }
        for (int i=0;i<rowProduct.length;i++)
        {
            rowProduct[i]=1;
        }
        int bigCol=0;
        int bigRow=0;
        int rowFind=0;
        int colFind=0;
        int coordinate=0;
        for (int c =0;c<grid[0].length;c++)
        {
            for (int r=0;r<grid.length;r++)
            {
                if (grid[r][c]==0)
                {
                    colProduct[c]*=1;
                } else
                    colProduct[c]*=grid[r][c];
            }
        }
        for (int r =0;r<grid.length;r++)
        {
            for (int c=0;c<grid[0].length;c++)
            {
                if (grid[r][c]==0)
                {
                    rowProduct[c]*=1;
                } else
                    rowProduct[r]*= grid[r][c];
            }
        }
        for (int i=0;i<colProduct.length;i++)
        {
            if (bigCol<colProduct[i])
            {
                bigCol=colProduct[i];
                colFind=i;
            }
        }
        for (int i=0;i<rowProduct.length;i++)
        {
            if (bigRow<rowProduct[i])
            {
                bigRow=rowProduct[i];
                rowFind=i;
            }
        }
        coordinate=grid[rowFind][colFind];
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
