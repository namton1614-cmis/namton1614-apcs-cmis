import javax.swing.JOptionPane;
import java.util.Scanner;
public class GobboYushaKey {

    public static void main (String argvs [] )
    {
        String response ="";

        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat is your name?");
        String heroName = input.nextLine();
        System.out.print("\nThese are your current stats.\n");

        Hiro hero = new Hiro ();
        hero.setName (""+heroName);
        System.out.println ( hero);
        System.out.println("An angry goblin has appeared!");
        MrGobbo gobA = new MrGobbo ();
        System.out.println ( gobA);
        int goblife=gobA.getHp() ;
        int herolife=hero.getHp();
        while ( goblife>0 && herolife>0)
        {  System.out.println("\nWhat will you do?");
            response = input.nextLine();

            if ( response.equals("hit") || response.equals("punch") || response.equals("a") )
            {
                double k = Math.random();
                if (k<0.1)
                { System.out.println( "Your attack crit!" ); 
                    goblife -= hero.getAtk()*3;
                    gobA.setHp (goblife);
                    System.out.println ( gobA);
                } else
                if (k>0.3)
                {
                    System.out.println( "You hit the goblin!" ); 
                    goblife -= hero.getAtk();
                    gobA.setHp (goblife);
                    System.out.println ( gobA);
                }else
                {
                    System.out.println ("Your attack misses. ");
                }
                k = Math.random();
                if (k>0.4)
                {
                    System.out.println( "The angry goblin hits back!" ); 
                    int dmg =  (int)(Math.random()*10)+3;
                    herolife -=dmg;
                    hero.setHp (herolife);
                    System.out.println ( hero);

                }else{

                    System.out.println ("The goblin misses. ");
                }

            }   else 
            {
                System.out.println ("Command not recognized. \n" );
            }

        }
        if (goblife<=0)
        {
            System.out.println ("Angry goblin has been defeated! \n" );
        }
        if (herolife<=0)
        {
            System.out.println ("You have has been defeated! \n" );
        }
        /*
        String input = JOptionPane.showInputDialog( "English" );
        double english = Integer.parseInt ( input );
        String input2 = JOptionPane.showInputDialog( "Math" );
        double math = Integer.parseInt ( input2 );
        String input3 = JOptionPane.showInputDialog( "Science" );
        double science = Integer.parseInt ( input3 );        
        String input4 = JOptionPane.showInputDialog( "Fine Arts" );
        double art = Integer.parseInt ( input4 );
        String input5 = JOptionPane.showInputDialog( "Social Science" );
        double social = Integer.parseInt ( input5 );
        // setting various gpa of various classes
        double grades []= { english, math, science, art, social};
        // stored in array
        junior001.setGPA( grades);
        // change gpa with setter method
        System.out.println ( junior001);

        MrGobbo gobB = new MrGobbo ("John the Joker", 12, 80);
        System.out.println ( gobB);
         */
    }
} //end class StudentDriver

