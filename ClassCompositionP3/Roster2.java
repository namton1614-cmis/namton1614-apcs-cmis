import java.util.ArrayList;
public class Roster2     {
    ArrayList<Student> apComputerScience = new ArrayList<Student>(); 
    public Roster2( )
    {
        Student a= new Student( "KQLY ", "Pride ", 12 );
        Student b = new Student( "Athrun ","Zala ", 12 );
 
        apComputerScience.add( a );
        apComputerScience.add( b );
 
    } 
    public void addStudent ( Student newStudent ) 
    {
        apComputerScience.add(newStudent);
    }

    public void dropStudent ( String lastName ) 
    {
        for (int i=0;i<apComputerScience.size();i++)     
        {
 
            if(apComputerScience.get(i).getLastName().equals(lastName))
            {
                apComputerScience.remove(i); 
                i--;
            }
        }
    }  
        public String toString( )
    {
        String ok ="";
        for (Student x: apComputerScience)
        {
            ok += x +"\n";
        }
        String output = new String();
        output =  ok  ;
        return output;
    }
}
