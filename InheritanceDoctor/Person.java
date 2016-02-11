
public class Person
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;

    }

    public String toString()
    {
        return String.format("Name: %s ", name );
    }

}