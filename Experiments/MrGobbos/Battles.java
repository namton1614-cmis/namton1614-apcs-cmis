
public class Battles
{

    public Battles()
    {
        if (goblife<=0)
        {
            System.out.println ("Angry goblin has been defeated! \n" );
            hero.lvl=2;
            MrGobbo gobB = new MrGobbo ("John the Joker", 12, 300);
            goblife=gobB.getHp() ;
            herolife=hero.getHp();
            System.out.println ( gobB);
            System.out.println("Another angry goblin has appeared! " +hero.lvl);
            while ( goblife>0 && herolife>0)
            {  System.out.println("\nWhat will you do?");
                response = input.nextLine();
                double k = Math.random();
                if ( response.equals("hit") || response.equals("punch") || response.equals("a") )
                {
                    System.out.println( hero.getAtk()+"\n" ); 
                    if (k<0.05)
                    { System.out.println(  hero.getAtk() ); 
                        goblife -= hero.getAtk()*3;
                        gobB.setHp (goblife);
                        System.out.println ( gobB);
                    } else
                    if (k>0.3)
                    {
                        System.out.println( "You hit the goblin!\n" ); 
                        goblife -= hero.getAtk()+(int)(Math.random()*3);
                        gobB.setHp (goblife);
                        System.out.println ( gobB);
                    }else
                    {
                        System.out.println ("Your attack misses. \n");
                    }

                }   else if (response.equals ("potion") || response.equals ("heal") && potion>0)
                {
                    System.out.println( "You drank a health potion!\n" ); 
                    herolife +=45;
                    potion--;
                    hero.setHp (herolife);
                    System.out.println ( hero);
                }
                else
                {
                    if (potion == 0)
                    {
                        System.out.println ("No more potions. \n" );
                    }else
                    {
                        System.out.println ("Command not recognized. \n" );
                    }
                }
                k = Math.random();
                if (k>0.4)
                {
                    System.out.println( "The angry goblin hits you!\n" ); 
                    int dmg =  (int)(Math.random()*4)+6;
                    herolife -=dmg;
                    hero.setHp (herolife);
                    System.out.println ( hero);

                }
                else{

                    System.out.println ("The goblin misses. \n");
                }

            }

            if (goblife<=0)
            {
                System.out.println ("Angry goblin has been defeated! \n" );
            }
        }
    }
}
