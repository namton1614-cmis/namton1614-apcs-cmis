
public class Clock
{
    private int hour;
    private int minute;
    private int second;
    public Clock()
    {
        hour =0;
        minute =0;
        second =0;

    } //end constructor Clock

    public Clock ( int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
        output =  "The time is " + hour + ":" +  minute + ":" + second + "\nTotal seconds is " +  totalSeconds() ;
        return output;
    }
}
