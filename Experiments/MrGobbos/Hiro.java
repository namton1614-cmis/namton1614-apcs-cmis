
public class Hiro
{
    private int hp;
    private String name;
    public int lvl =1;
    private int atk;
    public Hiro()
    {
        hp = 100;
        this.lvl=lvl;
        atk=9*lvl;
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

    public String toString()
    {
        String output = String.format( 
                "Hero:  %s\n"
                + "HP: %d\n"
                + "Level: %d\n",

                name, hp ,lvl);
        return output; 
    }
}