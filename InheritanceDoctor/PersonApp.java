public class PersonApp
{
    public static void main(String[] args)
    {
        Person[] people = new Person[3];
        people[0] = new Person("Nathan Kieffer");
        people[1] = new Doctor("Jason Chei", 35, 43, "Ram Hospital");
        people[2] = new Maestro("Tsap Tsap Tsui", 345, 22, "John's Hospital", true);
        for ( Person person : people )
        {
            System.out.println(person + "\n");
        }     
    }
}