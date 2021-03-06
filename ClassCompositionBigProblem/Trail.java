import java.util.ArrayList;
public class Trail     {
    ArrayList<Integer> markers = new ArrayList<Integer>(); 
    int netElevation=0;
    public Trail( )
    {
        for (int i=0; i<13;i++)
        {
            markers.add( (int)(Math.random()*70)+50 );
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
        boolean check = false;
        if (markers.get(begin)==markers.get(end))
        {
            check=true;
            for (int i=begin;i<end;i++)
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
        netElevation=0;
        for (int i=begin;i<end;i++)
        {
            if (i>0&& (markers.get(i)-markers.get(i-1))>0)
            {
                netElevation+=(markers.get(i)-markers.get(i-1));
            }
        }
        if (!isLevelTrailSegment(begin, end) && netElevation>100)
            return true;
        
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
        output += "Total Distance of Trail is : "+getLength()+"\n";
        output += "Trail Level: " +  isLevelTrailSegment( 0,markers.size()-1)+"\n";
        output += "Trail Difficult: " +         isDifficult(0,markers.size()-1)+"\n";
        output += "Net Elevation : "+netElevation+"\n";
        return output;
    }
}
