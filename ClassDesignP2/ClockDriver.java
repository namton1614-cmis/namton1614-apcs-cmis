import javax.swing.JOptionPane;  
public class ClockDriver {
    public static void main (String argvs [] )
    {
        Clock kitchenClock = new Clock ();
        String input = JOptionPane.showInputDialog( "Hour" );
        int hour = Integer.parseInt ( input );
        String input2 = JOptionPane.showInputDialog( "Minute" );
        int minute = Integer.parseInt ( input2 );
        String input3 = JOptionPane.showInputDialog( "Second" );
        int second = Integer.parseInt ( input3 );
        Clock bedroomClock = new Clock(hour,minute,second);
        System.out.println ( "Kitchen: " +kitchenClock);
        System.out.println ("Bedroom: "+ bedroomClock);
    }
} //end class MyPhoneDriver
