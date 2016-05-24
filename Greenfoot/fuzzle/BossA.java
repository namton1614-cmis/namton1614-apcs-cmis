import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class BossA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossA extends Boss implements ChangeBoss
{
    ArrayList<Bullets> fire = new ArrayList<Bullets>(); 
    ArrayList<Bullets> fire2 = new ArrayList<Bullets>(); 
    ArrayList<Bullets> fire3 = new ArrayList<Bullets>(); 
    int counter2=0;
    /**
     * Act - do whatever the BossA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  BossA() 
    {
        super(100,50);
        
        fire.add(new Type1(90));
        fire2.add(new Type1(90));
        fire3.add(new Type1(90));

    }    

    public void spray()
    {
        World world = getWorld();
        counter2++;
        for (Bullets x:fire )
        {
            world.addObject(x,this.getX()+100,this.getY());
        }
        for (Bullets x:fire2 )
        {
            world.addObject(x,this.getX()-100,this.getY());
        }
        for (Bullets x:fire3 )
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
