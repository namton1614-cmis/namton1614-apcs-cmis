
public class FundamentalsP5
{
  public static void main ( String args[] ) 
  {
    String[] FavMovie = new String[3];
    FavMovie[0] = "Toy Story";
    FavMovie[1] = "Toy Story 2";
    FavMovie[2] = "Toy Story 3";
    
    int MovieNumber = FavMovie.length;
    for (int i = 0; i < MovieNumber; i++)
        {
         System.out.println( FavMovie[i]);
    } // end for
    System.out.println( "\n");
    
    String[] FavSong = new String[3];
    FavSong[0] = "Bahasa Palus";
    FavSong[1] = "Light Your Heart Up";
    FavSong[2] = "Breathless";
    
    int SongNumber = FavSong.length;
    for (int i = 0; i < MovieNumber-1; i++)
        {
         System.out.print( FavSong [i] + ", "  );  
        }   
    if  ( MovieNumber ==2)
         {        
             System.out.print( FavSong [i] + ", "  );  
            }

    
     System.out.println( );    
}// end main
} // end class FundamentalsP5