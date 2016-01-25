
public class Roster2Driver     {
    public static void main (String argvs [] )
    {
        Roster2 apComputerScience = new Roster2 ();
        System.out.println ( "INITIAL CLASS\n" +apComputerScience);
        Student a= new Student( "John ", "Johnson ", 12 );
        Student b = new Student( "Hwa ","Ryun ", 12 );
        Student c= new Student( "Snow ", "Lyre ", 10);
        apComputerScience.addStudent(a);
        apComputerScience.addStudent(b);
        apComputerScience.addStudent(c);
        System.out.println ( "ADD STUDENTS CLASS\n" +apComputerScience);
        apComputerScience.dropStudent("Ryun ");
        System.out.println ( "DROP STUDENTS CLASS\n" +apComputerScience);
    }
} //end class StudentDriver
