
public class Roster
{

    private Student []studentList;
    public Roster()
    {
        studentList= new Student [3];
        studentList[0] = new Student( "Jack ", "Jackson ", 12 );
        studentList[1] = new Student( "Athrun ","Athra ", 12 );
        studentList[2] = new Student( "Billie ", "Billson ", 11);

    } //end constructor Clock
    
    public String findStudentWithMaxGPA()
    {
        double gpaH=0;
        String output ="";
        for ( Student x : studentList) 
        {

            if (x.calcGPA()>=gpaH)
            {
                gpaH=x.calcGPA();
                output=x.getName();

            }

        }
        return output;
    }

    public String toString( )
    {
        String ok ="";
        for (Student x: studentList)
        {
            ok += x;
        }
        String output = new String();
        output =  ok + "\n\n " + findStudentWithMaxGPA();
        return output;
    }
}
