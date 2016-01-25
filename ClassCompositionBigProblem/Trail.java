import java.util.ArrayList;
public class Trail     {
    ArrayList<Integer> markers = new ArrayList<Integer>(); 
    public Trail( )
    {

        for (int i=0; i<13;i++)
        {

            markers.add( (int)(Math.random()*30)+50 );

        }

    } 

    public Trail(ArrayList<Integer> markers )
    {
        this.markers=markers;
    } 

    public void addMarker(int marker)
    {
        markers.add( marker );
    }

    public int getLength()

    {
        int sum=0;
        for (Integer x: markers)
        {  sum+=x;
        }
        return sum;
    }

    public String toString( )
    {
        String ok ="Index\tElevation\n" ;
        int i=0;
        for (Integer x: markers)
        {   i++;
            ok += i+"\t"+x+"\n";
        }
        String output = new String();
        output =  ok  ;
        return output;
    }
}
