
public class MyPod
{
    private int memory;
    private String color;
    private String[] songName;
    public MyPod()
    {
        memory =4;
        color = new String ("Green");
         songName =  new String[]{"Jack, ", "Mann, ","Azerbaijan"};
    } //end constructor  
   
    public MyPod( int memory, String color, String[] songName)
    {
        this.memory =memory;
        this.color = color;
        this.songName = songName;

    } //end constructor  

    public String toString()
    {
              String song ="";
         for (String x: songName)
        {
               song += x;
        }
        return String.format(  
            "Memory: %d\n" +
            "Color: %s\n" +
            "Song: %s\n" 
            ,
     
        memory,color,song );

    }
}
