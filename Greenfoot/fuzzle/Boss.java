import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Final
{
    private int hp;
    private int noPower;

    public Boss( int hp, int noPower)
    {
        this.hp=hp;
        this.noPower=noPower;
    }

    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (hp<0)
        {
            die();
        }
        powerStep();
        movement();
    }     

    public void die()
    {
        World world = getWorld();
        world.removeObject(this);
    }

    public void damage()
    {
        hp--;
    }

    public void powerStep()
    {
        double rng=1;
        if( hp>0)
        {
            for (int i=0;i<10;i++)
            {
                double temp=Math.random();
                if (temp<rng)
                    rng=temp;
            }
            if (rng>0.4)
            {
                noPower--;
                spawnPower();
            }

        }
    }

    public void spawnPower()
    {
        World world = getWorld();
        Power Power = new Power();
        world.addObject(Power,this.getX(),this.getY());

    }

    public void movement()
    { 
        int up=(int)(Math.random()*10)-5;
        int right=(int)(Math.random()*20)-11;
        
        

        setLocation(getX()+right,getY());
        setLocation(getX(),getY()-up);

    }
}
