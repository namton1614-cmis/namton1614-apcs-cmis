import java.util.ArrayList;
public class SuperHeroDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<Student>  classroom= new ArrayList<Student>(); 
        Student.add( new UnderGrad ());
        Student.add(new UnderGrad ());
        Student.add(new Graduate ());
        Student.add(new Graduate ());
        Student.add(new PostGraduate ());
        Student.add(new PostGraduate ());
    }
} //end class StudentDriver
