
public class Battles
{

    public Battles()
    {
        while ( goblife>0 && herolife>0)
        {  System.out.println("\nWhat will you do?");
            response = input.nextLine();

            if ( response.equals("hit") || response.equals("punch") || response.equals("a") )
            {
                double k = Math.random();
                if (k<0.05)
                { System.out.println( "Your attack crit!\n" ); 
                    goblife -= hero.getAtk()*3;
                    gobA.setHp (goblife);
                    System.out.println ( gobA);
                } else
                if (k>0.3)
                {
                    System.out.println( "You hit the goblin!\n" ); 
                    goblife -= hero.getAtk()+(int)(Math.random()*3);
                    gobA.setHp (goblife);
                    System.out.println ( gobA);
                }else
                {
                    System.out.println ("Your attack misses. \n");
                }
                k = Math.random();
                if (k>0.4)
                {
                    System.out.println( "The angry goblin hits back!\n" ); 
                    int dmg =  (int)(Math.random()*10)+3;
                    herolife -=dmg;
                    hero.setHp (herolife);
                    System.out.println ( hero);

                }else{

                    System.out.println ("The goblin misses. \n");
                }

            }   else 
            {
                System.out.println ("Command not recognized. \n" );
            }

        }
    }
}
