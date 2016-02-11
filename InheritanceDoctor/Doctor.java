
public class Doctor extends Person
{
    private String name;
    int save;
    int age;
    private String hospital;
    public  Doctor(String name, int save, int age, String hospital)
    {
        super (name);
        this.age=age;
        this.save=save;
        this.hospital = hospital;
    }

    public String toString()
    {
        return super.toString() +String.format("\nPatients saved: %d\nAge: %d\nHospital: %s" ,save, age, hospital);

    }
}