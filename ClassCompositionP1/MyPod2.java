import java.util.ArrayList;
public class MyPod2
{
    private int memory;
    private String color;
    ArrayList<String> songs = new ArrayList<String>(); 
    public MyPod2()
    {
        memory =4;
        color = new String ("Green");
        songs.add("With Mila's Divine Protection");
        songs.add("Attack");
        songs.add("Eternal Bonds");
        songs.add("Against the Dark Knight");
        songs.add("Main Theme");
        songs.add("Power Hungry Fool");

    } //end constructor  

    public MyPod2( int memory, String color)
    {
        this.memory =memory;
        this.color = color;


    } //end constructor  

    public String toString()
    {
        String song ="";
        for (String x: songs)
        {
            song += x+"\n";
        }
        return String.format(  
            "Memory: %d\n" +
            "Color: %s\n" +
            "Song:\n%s\n" 
        ,

            memory,color,song );

    }
}
