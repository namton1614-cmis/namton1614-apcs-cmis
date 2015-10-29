
public class SongDriver {
    public static void main (String argvs [] )
    {

        Song song1 = new Song ();
        Song song2 = new Song("Colors", "Flow",222, 23523);
        System.out.println ( "Song 1  \n" +song1);
        System.out.println ( "Song 2  \n" +song2);

        song1.setyearReleased( 1999);
        System.out.println ( "Song 1  \n" +song1);

        song2.setyearReleased( 2005);
        System.out.println ( "Song 2  \n" +song2);
        System.out.println ("Get song1 "+ song1.getyearReleased());
        System.out.println ("Get song2 "+ song2.getyearReleased());
    }
} //end class MyPhoneDriver
