import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class BossA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossC extends Boss implements ChangeBoss
{
    ArrayList<Bullets> fire = new ArrayList<Bullets>(); 
    int counter2=0;
    int i=0;
    /**
     * Act - do whatever the BossA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  BossC() 
    {
        super(220,50);

    }    

    public void spray()
    {
        World world = getWorld();
        counter2++;
        for (Bullets x:fire )
        {
            world.addObject(x,this.getX(),this.getY());
        }
        if  (counter2>10)
        { counter2=0;
            i=0;
            while( i<=360)
            {
                fire.add(new Type1(i));
                i+=45;
            }
        }
    }

    public void nextboss()
    {
        Greenfoot.setWorld(new Win());
    }
}
