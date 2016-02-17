
public class Graduate extends Student
{ 

    public int calculateTuition()
    {
        int tuition=getUnits()*500;
        return tuition ;
    }

    public  Graduate (String name,String major, int units)
    {
        super (name,major,units);
    }

    public String toString()
    {
        return super.toString() ;

    }
}