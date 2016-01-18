
public class Clock
{
    private int hour;
    private int minute;
    private int second;
    public Clock()
    {

    } //end constructor Clock

    public Clock ( int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void convertDaylightSaving( int hours )
    {
        double rand=Math.random();
        if (rand > 0.5)
        {
            this.hour = hour+1;
        }
        else {
            this.hour = hour-1;
        }
    }

    public void setTime (int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int totalSeconds()
    {

        int output = (hour*3600)+(minute*60)+(second);
        return output;

    }

    public String toString( )
    {
        String output = new String();
        output =  "The time is " + hour + ":" +  minute + ":" + second + "\nTotal seconds is " +  totalSeconds()+"\n" ;
        return output;
    }
}
