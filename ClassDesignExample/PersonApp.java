public class PersonApp
{
    public static void main ( String[] argv )
    {
        Person p1 = new Person( );
        Person p2 = new Person( 40, 190.0, 184.0, "N", "K", true);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
