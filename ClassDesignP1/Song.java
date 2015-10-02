
public class Song
{
    private int songLength;
    private double cost;
    private String artist;
    private String name;
    private boolean good;

    public Song()
    {
        songLength =20;
        cost =13;
        artist = new String ("KaKao");
        name = new String ("Flowers");
        good = true;

    } //end constructor Song
    public Song (String name, int cost, String artist, boolean good)
    {
        this.name = new String (name);
        this.cost =cost;
        this.artist = new String (artist);
        this. good = good;
    }

    public String toString( )
    {
        String output = new String();
        output = "Song name is " + name + "\nCost is " + cost + "\nArtist is " + 
        artist + "\nGood? " + good ;
        return output;
    }

}
