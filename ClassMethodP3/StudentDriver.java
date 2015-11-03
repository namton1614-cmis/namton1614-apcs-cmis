import javax.swing.JOptionPane;
public class StudentDriver {
    public static void main (String argvs [] )
    {
        Student senior001 = new Student ();
        System.out.println ( "Senior001" +senior001);

        String input = JOptionPane.showInputDialog( "English" );
        double en = Integer.parseInt ( input );
        String input2 = JOptionPane.showInputDialog( "Math" );
        double math = Integer.parseInt ( input2 );
        String input3 = JOptionPane.showInputDialog( "Science" );
        double science = Integer.parseInt ( input3 );        
        String input4 = JOptionPane.showInputDialog( "Fine Arts" );
        double art = Integer.parseInt ( input4 );
        String input5 = JOptionPane.showInputDialog( "Social Science" );
        double social = Integer.parseInt ( input5 );
        double grade []= { en, math, science, art, science};
        senior001.setGPA( grade );

        Student junior001 = new Student ("Graham", "Jones", 11, 4.00);
        System.out.println ( "Junior001" +junior001);

    }
} //end class StudentDriver
