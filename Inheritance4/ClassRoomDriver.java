import java.util.ArrayList;
public class ClassRoomDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<Student>  classroom= new ArrayList<Student>(); 
        classroom.add( new UnderGrad ("Jackson Manns", "Chemical Engineering", 8));
        classroom.add(new UnderGrad ("Xiao Huang", "Forensic Psychology",6));
        classroom.add(new Graduate ("Haru Takashita", "Business Management", 7));
        classroom.add(new Graduate ("Weiss Stein", "Medical Technology",8));
        classroom.add(new PostGraduate ("Leona Faire", "Chinese Philosphy", 7));
        classroom.add(new PostGraduate ("Revive Revival", "Genetic Engineering",7));

      
        int   i=0;
        Student [][] line = new Student [3][2];
        for (int r=0;r<line.length;r++)
        {
            for (int c=0;c<line[0].length;c++)
            {
                line[r][c]=classroom.get(i);
                i++;
                            System.out.print ( line[r][c]);
            }
                                        System.out.println ();
        }
    }
} //end class StudentDriver
