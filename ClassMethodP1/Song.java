
public class Song
{
    private double songLength;
    private String artist;
    private String name;
    public Song()
    {
        songLength =18.38;
        artist = new String ("Wagner");
        name = new String ("Siegfried-Idyll");

    } //end constructor Song
    public Song (String name, String artist, double songLength)
    {
        this.name = new String (name);
        this.artist = new String (artist);
        this.songLength = songLength;
    }
    public String toString( )
    {
        String output = new String();
        output = "Song name is " + name  + ".\nArtist is " + 
        artist + ".\nThe song is " + songLength +" minutes long." ;
        return output;
    }
}
