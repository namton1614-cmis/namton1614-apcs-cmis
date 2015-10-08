
public class Clock
{
    private int hour;
    private int minute;
    private int second;
    public Clock()
    {
        hour =12;
        minute = 32;
        second = 34;

    } //end constructor Song
    public Clock ( int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString( )
    {
        String output = new String();
        output =  "The time is " + hour + ":" +  minute + ":" + second ;
        return output;
    }
}
