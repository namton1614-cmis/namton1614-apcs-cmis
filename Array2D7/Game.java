public class Game
{   
    int [][] gameBoard;
    int row=5;
    int col=5;
    int zRow;
    int zCol;
    int gRow;
    int gCol;
    public Game ()
    {
        gameBoard=new int[row][col];
        for (int r =0;r<gameBoard.length;r++)
        {
            for (int c=0;c<gameBoard[0].length;c++)
            {
                gameBoard[r][c]=(int)(Math.random()*100)+1;
            }
        }
    }

    public Game (int row , int col)
    {
        this.row=row;
        this.col=col;
        gameBoard=new int[row][col];
        for (int r =0;r<gameBoard.length;r++)
        {
            for (int c=0;c<gameBoard[0].length;c++)
            {
                gameBoard[r][c]=(int)(Math.random()*100)+1;
            }
        }
    }

    public void RandomZero ()
    {
        zRow=(int)(Math.random()*row);
        zCol=(int)(Math.random()*col);
        gameBoard[zRow][zCol]=0;
    }

    public boolean guess( int gRow, int gCol)
    {
        gameBoard[gRow][gCol]= 500 ;
        this.gCol=gCol;
        this.gRow=gRow;
        if (gRow==zRow&&gCol==zCol)
            return true;
        else
            return false;
    }

    public String OffBy()
    {
        int rowDiff = Math.abs(zRow-gRow);
        int colDiff = Math.abs(zCol-gCol);
        String output  ="Your row is off by: " +rowDiff+ "\nYour column is off by: " + colDiff;
        return output;
    }

    public String toString( )
    {
        String output = new String();
        for (int[] RKZ:gameBoard)
        {
            for (int VKZ:RKZ)
            {
                if (VKZ<100)
                    output+= "X\t";
                else if (VKZ>100)
                    output+="N\t";
            }
            output+= "\n";
        }
        return output;
    }
}