public class PersonArrayApp
{
    public static void main ( String[] argv )
    {
        Person[] people = new Person[10];
        for ( Person person : people )
        {
            person = new Person();
            System.out.println(person);
        }
    }
}