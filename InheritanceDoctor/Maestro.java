
public class Maestro extends Doctor
{
    private boolean evil;

    public  Maestro(String name, int save, int age, String hospital,boolean evil )
    {
        super (name, save, age, hospital);
       this.evil=evil;
    }

    public String toString()
    {
        return super.toString() +String.format( "\nEvil Genius??? %s" ,evil);

    }
}