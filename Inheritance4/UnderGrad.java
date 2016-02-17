
public class UnderGrad extends Student
{ 

    public int calculateTuition()
    {
        int tuition=getUnits()*250;
        return tuition ;
    }

    public  UnderGrad (String name,String major, int units)
    {
        super (name,major,units);
    }

    public String toString()
    {
        return super.toString() ;

    }
}