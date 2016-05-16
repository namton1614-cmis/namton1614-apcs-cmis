import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class BossA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossA extends Boss
{
    ArrayList<Bullets> fire = new ArrayList<Bullets>(); 
    int counter2=0;
    /**
     * Act - do whatever the BossA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  BossA() 
    {
        super(50,50);
        fire.add(new Type1(0));
        fire.add(new Type1(45));
        fire.add(new Type1(90));
        fire.add(new Type1(135));
        fire.add(new Type1(180));
        fire.add(new Type1(225));
        fire.add(new Type1(270));
        fire.add(new Type1(315));
        fire.add(new Type1(360));
        fire.add(new Type2(0));
        fire.add(new Type2(45));
        fire.add(new Type2(90));
        fire.add(new Type2(135));
        fire.add(new Type2(180));
        fire.add(new Type2(225));
        fire.add(new Type2(270));
        fire.add(new Type2(315));
        fire.add(new Type2(360));
    }    

    public void spray()
    {
        World world = getWorld();
        counter2++;
        for (Bullets x:fire )
        {
            world.addObject(x,this.getX(),this.getY());
        }
        if (counter2>10)
        { counter2=0;

        }
    }

    public void nextboss()
    {
        World world = getWorld();

        BossB bossB = new BossB();
        world.addObject(bossB,this.getX(),this.getY());
        world.removeObject(this);
    }
}
