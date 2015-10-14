/**
 * You may not modify this file aside from uncommenting the parts of the program as you get to them.
 */
 
public class CubiverseApp
{
    public static void main ( String[] argv )
    {
        int numCubiverses = 5;
        Cubiverse[] zero = new Cubiverse[numCubiverses];
        // uncomment these lines when you get to #2 an #3
        Cubiverse[] threeA = new Cubiverse[numCubiverses];
        Cubiverse[] threeB = new Cubiverse[numCubiverses];
        double x, y, z;
        int w, h, d;
        String name;
        for ( int i = 0; i < numCubiverses; i++ )
        {
            //#1
            zero[i] = new Cubiverse();

            //#2 Uncomment the section below when you are ready to work on it.
            
            w = (int)(Math.random() * i * 10) + 1;
            h = (int)(Math.random() * i * 10) + 1;
            d = (int)(Math.random() * i * 10) + 1;
            name = "CubiVerse-"+i * Math.random();
            threeA[i] = new Cubiverse( w, h, d, name);
            
            
            //#3 Uncomment the section below when you are ready to work on it.
            
            x = Math.random();
            y = Math.random();
            z = Math.random();
            name = "CubiVerse-"+i * Math.random();
            threeB[i] = new Cubiverse(x, y, z, name);
            
            
        }
        
        System.out.println("Zero Arguments\n==============");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            System.out.println(zero[i]);
        }
        System.out.println("Three A Arguments\n=================");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            //#2 uncomment the line below when you are ready to use it.
            System.out.println(threeA[i]);
        }
        System.out.println("Three B Arguments\n=================");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            //#3  uncomment the line below when you are ready to use it.
            System.out.println(threeB[i]);
        }     
    }
}