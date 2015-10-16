public class PlanetApp
{   
    public static void main ( String[] argv )
    {
        int maxPopulation;
        double percentSpaceMarines;
        int maxSpaceMarinesPerStarDestroyer;
        int nPlanets = 10;
        Planet p;
        
        System.out.println("Zero Args\n=========");
        for ( int i = 0; i < nPlanets; i++ )
        {
            p = new Planet();
            System.out.println(p);
        }
        //Uncomment the section below when you want to work on it.
        
        System.out.println("Three Args\n==========");
        for ( int i = 0; i < nPlanets; i++ )
        {
            maxPopulation = (i + 1) * 10000000;
            percentSpaceMarines = (Math.random() * 30)/100;
            maxSpaceMarinesPerStarDestroyer = 1000;
            
            p = new Planet( maxPopulation, percentSpaceMarines, maxSpaceMarinesPerStarDestroyer );
            System.out.println(p);
        }
        
    }
}