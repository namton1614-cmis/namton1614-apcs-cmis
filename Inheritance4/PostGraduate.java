
public class PostGraduate extends Student
{ 

    public int calculateTuition()
    {
        int tuition=getUnits()*750;
        return tuition ;
    }

    public  PostGraduate (String name,String major, int units)
    {
        super (name,major,units);
    }

    public String toString()
    {
        return super.toString() ;

    }
}