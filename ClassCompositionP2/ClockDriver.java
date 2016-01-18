import javax.swing.JOptionPane;  
public class ClockDriver {
    public static void main (String argvs [] )
    {
        /* String input = JOptionPane.showInputDialog( "Hour" );
        int hour = Integer.parseInt ( input );
        String input2 = JOptionPane.showInputDialog( "Minute" );
        int minute = Integer.parseInt ( input2 );
        String input3 = JOptionPane.showInputDialog( "Second" );
        int second = Integer.parseInt ( input3 );

        Clock clock = new Clock(hour,minute,second);
        System.out.println ("Master Initial: "+ clock);
        clock.setTime( (int)(Math.random()*24), (int)(Math.random()*60),(int)(Math.random()*60));

        System.out.println ("Master Random Set: "+ clock);
        clock.convertDaylightSaving(hour);
        System.out.println ("Daylight Random Set: "+ clock +"\n");
         */
        ClockStore RinClock = new ClockStore();
        System.out.println ( RinClock);
System.out.println (RinClock.mostSecond());
    }
} //end class MyPhoneDriver
