
public class MrGobbo
{
    private int hp;
    private String name;
    private int lvl;
    public MrGobbo()
    {
        hp = 150;
        lvl=5;
        name = new String ("Billy the Butcher");
    } //end constructor Student Zero

    public MrGobbo (String name, int diff, int hp)
    {

        this.name = new String (name);
        this.lvl =diff;
        this.hp = hp;
    }

    public void setHp(int  hp )
    {
        this.hp=hp  ;
    }

    public int getHp()
    {
        int output =hp;
        return output;
    }

    public String toString()
    {
        String output = String.format( 
                "Enemy:  %s\n"
                + "HP: %d\n",

                name, hp );
        return output; 
    }
}
