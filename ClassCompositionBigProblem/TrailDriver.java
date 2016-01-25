import java.util.ArrayList;
public class TrailDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<Integer> neon = new ArrayList<Integer>(); 
        neon.add( 60 );
        neon.add( 55 );
        neon.add( 60 );
        neon.add( 55 );                    
        neon.add( 60 );
        neon.add( 60 );
        neon.add( 60 );
        neon.add( 60 );   

        Trail Fuji = new Trail ();
        Trail Everest = new Trail ();
        Trail Cook = new Trail (neon);

        Cook.addMarker(60);
        Cook.addMarker(50);
        Cook.addMarker(60);
        Cook.addMarker(60);
        Cook.addMarker(60);
        System.out.println ("\nFuji\n"+ Fuji +"\nCook\n"+ Cook +"\nEverest\n"+ Everest);

    }
} //end class  
