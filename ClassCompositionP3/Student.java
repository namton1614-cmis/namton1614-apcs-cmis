
public class Student
{
    private int gradelevel;
    private String firstname;
    private String lastname;
    private double [] grades = new double  [5];
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
        for (int i = 0; i<grades.length; i++) 
        {
            grades[i]=Math.random()*4;

        }
        this.firstname = new String (firstname);
        this.lastname = new String (lastname);
        this.gradelevel = gradelevel;
    }

    public String getName()
    {
        String output = firstname +" "+ lastname;
        return output ;

    }

    public void setGPA(double [] grades )
    {
        this.grades=grades  ;
    }

    public double calcGPA()
    {
        double gpaSum = 0;
        double output;
        for (int i = 0; i<grades.length; i++) 
        {
            gpaSum+=grades[i];

        } 

        output = gpaSum/5;

        return output;
    }

    public String getGrade()
    {
        String output = new String();
        String letterGrade ="";
        double compare = calcGPA();
        if (compare <1)
        {
            letterGrade = "F";
        }
        if (compare >=1)
        {
            letterGrade = "D";
        } 
        if (compare >2)
        {
            letterGrade = "C";
        }
        if (compare >3)
        {
            letterGrade ="B";
        }
        if (compare ==4)
        {
            letterGrade ="A";
        }

        output = "" + letterGrade;
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
                + "Letter Grade = %s\n",

                firstname, lastname,grades[0], grades[1],grades[2],grades[3],grades[4],(calcGPA()), 
                gradelevel, getGrade())
        ;
        return output; 
    }
}
