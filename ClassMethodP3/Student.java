
public class Student
{
    private int gradelevel;
    private String firstname;
    private String lastname;
    private double gpa;
    private double [] grades = new double [5];
    public Student()
    {
        for (int i = 0; i<grades.length; i++) 
        {
            grades[i]=0;

        }
        gradelevel =12;
        firstname = new String ("Mina");
        lastname = new String ("Hakuba");
        gpa = 3.75;
    } //end constructor Song
    public Student (String firstname, String lastname, int gradelevel, double gpa)
    {
        for (int i = 0; i<grades.length; i++) 
        {
            grades[i]=Math.random()*5;

        }
        this.firstname = new String (firstname);
        this.lastname = new String (lastname);
        this.gradelevel = gradelevel;
        this.gpa = gpa;
    }

    public void setGPA(double [] grades)
    {
            for (int i = 0; i<grades.length; i++) 
        {
            this.grades[i]=grades[i];

        }  
    }

    public String toString( )
    {
        String output = new String();
        output = "'s full name is " + firstname +" " +lastname + " and has a gpa of "  + 
        gpa + " studying at grade "+ gradelevel +"." ;
        return output;
    }
}
