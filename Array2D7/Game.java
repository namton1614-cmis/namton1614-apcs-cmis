public class Game
{   
    int [][] gameBoard;
    int row=5;
    int col=5;
    int zRow;
    int zCol;
    public Game ()
    {
        gameBoard=new int[row][col];
        for (int r =0;r<gameBoard.length;r++)
        {
            for (int c=0;c<gameBoard[0].length;c++)
            {
                gameBoard[r][c]=(int)(Math.random()*100);
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
                gameBoard[r][c]=(int)(Math.random()*100);
            }
        }
    }

    public void RandomZero ()
    {
        zRow=(int)(Math.random()*row);
        zCol=(int)(Math.random()*col);
        gameBoard[zRow][zCol]=0;
        System.out.println(zRow);
                System.out.println(zCol);
    }

    public boolean guess( int gRow, int gCol)
    {
        if (gRow==zRow&&gCol==zCol)
            return true;
            else
            return false;
    }

    public String toString( )
    {
        String output = new String();
        for (int[] RKZ:gameBoard)
        {
            for (int VKZ:RKZ)
            {
                output+=VKZ+"\t";
            }
            output+= "\n";
        }

        return output;
    }
}