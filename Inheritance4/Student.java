public abstract class Student
{
    private String name;
    private String major;
    private int units;
    public Student()
    {
        name = "Cheng Wei";
        major = "Doctor";
        units = 7;
    } 

    public Student(String name, String major, int units)
    {
        name =name;
        major = major;
        units = units;
    } 

    public void setName(String name)
    {
        this.name = new String( name );
    } 

    public String getName()
    {
        return name;	
    } 

    public void setMajor(String major)
    {
        this.major = major;	
    } 

    public String getMajor()
    {
        return major;	
    } 

    public void setUnits(int units)
    {
        this.units = units;	
    } 

    public int  getUnits()
    {
        return units;	
    } 

    abstract public int calculateTuition();
    
  public String toString()
    {
        String output = new String();
        output = "Name is\t"+ name +"\tMajor is" + major + "\tUnits taken: "+units+"\tTuitition Fees: "+calculateTuition();
        return output;
    } // end method toString
} // end abstract class SuperHero
