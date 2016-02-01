import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class JukeboxDrive     {
    public static void main (String argvs [] )
    {
        //         Scanner input = new Scanner(System.in);
        //         
        //         System.out.println("\nRow Dimension");
        //         int row = input.nextInt();
        //         System.out.println("\nColumn Dimension");
        //         int col = input.nextInt();
        Jukebox koni = new Jukebox();
        System.out.println (koni);
                System.out.println ("The jukebox is now playing: " +koni.randomSong());

    }
} //end class  
