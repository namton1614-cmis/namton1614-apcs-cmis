
public class Hiro
{
    private int hp;
    private String name;
    private int lvl;
    private int atk;
    public Hiro()
    {
        hp = 100;
        atk=10;
        lvl=1;
        name = new String ("");
    } //end constructor 
    public int getAtk()
    {
        return atk;
    }

    public void setName(String name )
    {
        this.name=new String(name); 
    }

    public int getHp()
    {

        return hp;
    }

    public void setHp(int  hp )
    {
        this.hp=hp  ;
    }

    /*
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

     */
    public String toString()
    {
        String output = String.format( 
                "Hero:  %s\n"
                + "HP: %d\n"
                + "Level: %d\n"
                + "Attack Power:%d",

                name, hp ,lvl,atk);
        return output; 
    }
}