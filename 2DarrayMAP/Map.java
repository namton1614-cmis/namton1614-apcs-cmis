

public class Map
{
    private String[][] data;
    int w, h;
    public Map(int w, int h)
    {
        data = new String[h][w];
        this.w = w;
        this.h = h;
        int x, y = 0;
        
        while ( y < h )
        {
            x = 0;
            while ( x < w )
            {
                if( Math.random() > .5 )
                {
                    data[y][x] = "X";
                }
                else
                {
                    data[y][x] = "O";
                }
                x++;
            }
            y++;
        }                
    }
    
    public String toString()
    {
        String out = "";
        int x, y=0;
        while ( y < h )
        {
            x = 0;
            while ( x < w )
            {
                out += data[y][x];
                
                x++;
            }
            out += "\n";
            y++;
        }
        return out;
    }        
}