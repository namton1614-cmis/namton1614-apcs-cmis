
public class Jukebox
{
    String [] name;
    int [] rating;
    int row;
    int col;
    MySong [][] songList=new MySong[3][4];
    public Jukebox()
    {
        row =3;
        col =4;
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );

    } //end constructor Song
    public Jukebox (String[] name, int[] rating, int row, int col)
    {
        this.name = name;
        this.rating= rating;
        this.row = row;    
        this.col = col;
    }

    public String randomSong ()
    {
        int row=(int)(Math.random()*3);
        int col=(int)(Math.random()*3);;
        return songList[row][col].getName();
    }

    public String ratingSong (int rating)

    { 
        String output = new String();
        for (MySong [] rowx: songList)
        {
            for (MySong letter: rowx)
            {
                output +=  "\n"+letter+"\n";
            }
        }
        return output;
    }

    public String toString( )
    {
        String output = new String();
        for (MySong [] rowx: songList)
        {
            for (MySong letter: rowx)
            {
                output +=  letter+"\t";
            }
            output +="\n\n";
        }

        return output;
    }
}
