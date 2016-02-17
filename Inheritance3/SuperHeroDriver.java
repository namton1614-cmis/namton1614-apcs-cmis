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
        ArrayList<SuperHero> capes = new ArrayList<SuperHero>();
        for (int i=0;i<heroes.size();i++)
        {
            if (heroes.get(i).isCaped()==true)
            {
                capes.add(heroes.get(i));
                heroes.remove(i);

                i--;
            }
        }
        int counter=0;
        System.out.println ("\nCaped Heroes");
        for (int r =0;r<capedHeroes.length;r++)
        {
            for (int c=0;c<capedHeroes[0].length;c++)
            {
                if (counter<capes.size())
                    capedHeroes[r][c]= capes.get(counter);
                if (capedHeroes[r][c]!=null)
                {
                    System.out.print (capedHeroes[r][c].getClass()+ "\t");
                }else 
                    System.out.print (capedHeroes[r][c]+ "\t");
                counter++;
            }
            System.out.println();
        }
        System.out.println ("\nCaped Heroes, non array [][]");
        for (SuperHero  x : capes)
        {
            System.out.println (x);
        }

        System.out.println ("\nRemaining heores");
        for (SuperHero x : heroes)
        {
            System.out.println (x);
        }
    }
} //end class StudentDriver
