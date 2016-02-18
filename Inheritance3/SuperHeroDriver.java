import java.util.ArrayList;
public class SuperHeroDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>(); 
        heroes.add( new DoraeMan ());
        heroes.add(new AsteriodMan ());
        heroes.add(new FriedEggMan ());
        System.out.println ("Original Heroes");
        for (SuperHero x : heroes)
        {
            System.out.println (x);
        }

        SuperHero [][] capedHeroes = new SuperHero [3][3];
        int counter=0;
        System.out.println ("\nCaped Heroes");
        for (int r =0;r<capedHeroes.length;r++)
        {
            for (int c=0;c<capedHeroes[0].length;c++)
            {
                if (heroes.get(counter).isCaped()==true)
                {
                    if (counter<heroes.size())
                    {   capedHeroes[r][c]= heroes.get(counter);
                        heroes.remove(counter);
                     
                    } else
                    {
                        counter++;
                    }
                }
                if (capedHeroes[r][c]!=null)
                {
                    System.out.print (capedHeroes[r][c].getClass()+ "\t");
                }else 
                    System.out.print (capedHeroes[r][c]+ "\t");

            }
            System.out.println();
        }

        System.out.println ("\nCaped Heroes");
        for (SuperHero[]  x : capedHeroes )
        {
            for (SuperHero k : x )
            {
                if (k!=null)

                    System.out.println (k);
            }
        }

        System.out.println ("\nRemaining heores");
        for (SuperHero x : heroes)
        {
            System.out.println (x);
        }
    }
} //end class StudentDriver
