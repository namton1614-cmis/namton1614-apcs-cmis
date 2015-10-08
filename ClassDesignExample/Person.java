
import javax.swing.JOptionPane;
class Person
{
    // instance variables
    private int age;
    private double weight;
    private double height;
    private String fname;
    private String lname;
    private boolean isMarried;

    public String toString()
    {
        return String.format("%s, %s\n" +
                            "Age: %d\n" +
                            "Height:%.20f\n" + 
                            "Weight: %.20f\n" +
                            "Marital Status: %s",
                            lname,fname,age,height,weight,isMarried ? "Married" : "Single");
    }
    
    public Person( int age, double weight, double height, String fname, String lname, boolean isMarried )
    {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.fname = fname;
        this.lname = lname;
        this.isMarried = isMarried;
    }
    public Person()
    {
        String[] names = {"Tom", "Dick", "Harry", "Jones", "Yuri", "Zahard", "Bam", "Rob" , "Jerry", "Elen"};
        int index = (int) (Math.random() * names.length);
        this.fname = names[index]; 
        this.lname = JOptionPane.showInputDialog("lname");
    }
    
    public Person( String fname, String lname )
    {
        this.fname = fname;
        this.lname = lname;
    }
    
    public Person(int age)
    {
        this.age = age;
    }

    public Person(double weight)
    {
        this.weight = weight;
    }
    
    public Person(double height, int age)
    {
    }
    
    public Person(int age, double weight)
    {
        
    }

}