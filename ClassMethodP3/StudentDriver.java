import javax.swing.JOptionPane;
public class StudentDriver {
    public static void main (String argvs [] )
    {
        Student senior001 = new Student ();
        System.out.println ( senior001);
        Student junior001 = new Student ("Joe", "Senior", 12);
        System.out.println ( junior001);

        String input = JOptionPane.showInputDialog( "English" );
        double english = Integer.parseInt ( input );
        String input2 = JOptionPane.showInputDialog( "Math" );
        double math = Integer.parseInt ( input2 );
        String input3 = JOptionPane.showInputDialog( "Science" );
        double science = Integer.parseInt ( input3 );        
        String input4 = JOptionPane.showInputDialog( "Fine Arts" );
        double art = Integer.parseInt ( input4 );
        String input5 = JOptionPane.showInputDialog( "Social Science" );
        double social = Integer.parseInt ( input5 );
        // setting various gpa of various classes
        double grades []= { english, math, science, art, social};
        // stored in array
        junior001.setGPA( grades);
        // change gpa with setter method
        System.out.println ( junior001);
    }
} //end class StudentDriver
