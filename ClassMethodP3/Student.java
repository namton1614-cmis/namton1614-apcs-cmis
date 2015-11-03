
public class Student
{
    private int gradelevel;
    private String firstname;
    private String lastname;
    private double [] grades = new double  [5];
    public double gpaSum;
    public Student()
    {
        for (int i = 0; i<grades.length; i++) 
        {
            grades[i]=Math.random()*4;

        }
        gradelevel =12;
        firstname = new String ("Billy");
        lastname = new String ("Bob");
    } //end constructor Student Zero

    public Student (String firstname, String lastname, int gradelevel)
    {

        this.firstname = new String (firstname);
        this.lastname = new String (lastname);
        this.gradelevel = gradelevel;
    }

    public void setGPA(double [] grades )
    {
        this.grades=grades  ;
    }

    public double calcGPA()
    {

        double output;
        this.gpaSum=gpaSum;
        for (int i = 0; i<grades.length; i++) 
        {
            gpaSum+=grades[i];

        } 
        this.gpaSum=gpaSum;
        output = gpaSum/5;

        return output;
    }

    public String toString()
    {
        String output = String.format( 
                "Firstname = %s\n"
                +  "Lastname = %s\n"
                +  "English gpa = %.2f\n" 
                +  "Math gpa = %.2f\n" 
                +  "Science gpa = %.2f\n" 
                +  "Fine Arts gpa = %.2f\n" 
                +  "Social Science gpa = %.2f\n" 
                +  "Average gpa = %.2f\n" 
                + "Grade Level = %d\n"
                + "AJFB = %.2f\n",
                firstname, lastname, (calcGPA()),grades[0], grades[1],grades[2],grades[3],grades[4],gradelevel, gpaSum)
        ;
        return output; 
    }
}
