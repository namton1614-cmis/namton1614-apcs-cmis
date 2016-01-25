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

    public boolean isLevelTrailSegment( int begin, int end )
    {
        boolean check = true;
        if (markers.get(begin)==markers.get(end))
        {
            for (int i=0;i<markers.size();i++)
            {
                if (i>0&&Math.abs(markers.get(i)-markers.get(i-1))>10)
                {
                    check=false;

                }
            }
        }
        if (check)
        {
            return true;
        }
        else 
            return false;
    }

    public boolean isDifficult(int begin, int end)
    {
        int netElevation=0;
        if (!isLevelTrailSegment(begin, end))
        {
            for (int i=0;i<markers.size();i++)
            {
                if (i>0|| markers.get(i)-markers.get(i-1)<0)
                {
                    int subtraction=Math.abs(markers.get(i)-markers.get(i+1));
                    netElevation+=subtraction;

                }
            }

        } 
        if (netElevation>100)
        {
            return true;
        }
        else 

            return false;

    }

    public String toString( )
    {
        String output ="Index\tElevation\n" ;
        int i=0;
        for (Integer x: markers)
        {   i++;
            output += i+"\t"+x+"\n";
        }
        output += "Total Distance of Trail is :"+getLength()+"\n";
        output += "Trail Level: " +  isLevelTrailSegment( 0,markers.size()-1);
        output += "Trail Difficult: " +         isDifficult(0,markers.size()-1);
        return output;
    }
}
