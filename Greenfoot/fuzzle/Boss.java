import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
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
    private int tele;

    public Boss( int hp, int noPower)
    {
        this.hp=hp;
        this.noPower=noPower;
        tele=0;
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
        if (getWorld()!=null)
            movement();
        teleport();
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
        int up=(int)(Math.random()*21)-10;
        int right=(int)(Math.random()*21)-10;

        setLocation(getX()+right,getY());
        setLocation(getX(),getY()-up);
        tele++;
    }

    public void teleport()
    {
        ArrayList<Integer> tp = new ArrayList<Integer>(); 
        tp.add(200);
        tp.add(400); 
        tp.add(600);        tp.add(800);
       int i =(int)(Math.random()*4);
        if (tele>100)
        {
            tele=0;
            setLocation( tp.get(i),200 );
        }
    }
}
