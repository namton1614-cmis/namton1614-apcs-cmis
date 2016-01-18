
public class ClockStore
{

    private Clock []clocksInStock;
    public ClockStore()
    {
        clocksInStock= new Clock [3];
        clocksInStock[0] = new Clock( 12, 30, 45 );
        clocksInStock[1] = new Clock( 10, 24, 52 );
        clocksInStock[2] = new Clock( 12, 29, 13 );

    } //end constructor Clock

    public int mostSecond()
    {
        int output =0;
        for (int k =0;k<clocksInStock.length;k++)
        {
            if    ( clocksInStock[k].totalSeconds()>output)
            { output=clocksInStock[k].totalSeconds();
            }
        }
        

        return output;

    } //end constructor Clock

    public String toString( )
    {
        String ok ="";
        for (Clock x: clocksInStock)
        {
            ok += x;
        }
        String output = new String();
        output =  ok;
        return output;
    }
}
