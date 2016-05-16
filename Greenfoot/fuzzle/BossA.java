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
        super(2000,50);

        fire.add(new Type2(135));
        fire.add(new Type2(90));
        fire.add(new Type2(45));

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
    }
}
