
public class MyPod
{
    private int memory;
    private String color;
    private String[] songName;
    public MyPod()
    {
        memory =4;
        color = new String ("Green");
        String[] songName = {"Jack", "Mann","Azerbaijan"};

    } //end constructor Song
    public MyPod( int memory, String color, String[] songName)
    {
        this.memory =memory;
        this.color = color;
        this.songName = songName;

    } //end constructor Song

    public String toString()
    {
        return String.format(  
            "Memory: %i\n" +
            "Color:%d\n" + 
            "Songs?: %d\n" +

            memory,color,songName );
    }
}
