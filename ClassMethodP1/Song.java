import java.util.Scanner;
public class Song
{
    private int songLength;
    private String newLength;
    private String artist;
    private String name;
    private int yearReleased;
    public Song()
    {
        songLength =237;
        artist = new String ("Man with A Mission");
        name = new String ("Database");
        yearReleased = 2013;

    } //end constructor Song
    
    
            public int getyearReleased ()
    {
        return yearReleased;
    }

    public void setyearReleased ( int year)
    {
        Scanner input = new Scanner(System.in);
      int password = 0;
        while ( password !=314159)
        {
        System.out.println("\nInput Username.");

        String username = input.nextLine();

        if ( username.equals("SecondRight" ))
        {
            System.out.println("\nInput Password.");
             password = input.nextInt();
          if (password ==314159 )
          {
                   this.yearReleased = year;
              System.out.println( "Welcome, SecondRight. The release dates have been changed. \n" ); 
           }
           else 
           {
              System.out.println ("Password Incorrect. Access Denied.  \n" );
            }
        }
        else 
        {
           System.out.println ("Username Incorrect. Access Denied.  \n" );
        }

      }

    }
    public Song (String name, String artist, int songLength, int yearReleased)
    {
        this.name = new String (name);
        this.artist = new String (artist);
        this.songLength = songLength;
        this.yearReleased = yearReleased;
    }

    public String convertToMinSec()
    {
        String output = new String() ;
        int min=songLength/60;
        int sec=songLength%60;
        output = min +" minutes and "+sec +" seconds "; 
        return output;
    }     

    public String toString( )
    {
        String output = new String();
        output = "Song name is " + name  + ".\nArtist is " + 
        artist + ".\nThe song is " + convertToMinSec() +" long\nReleased in " + yearReleased +".\n";
        return output;
    }

}
