import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class BossA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossB extends Boss implements ChangeBoss
{
    ArrayList<Bullets> fire = new ArrayList<Bullets>(); 
    int counter2=0;
    int i=0;
    int k=0;
    /**
     * Act - do whatever the BossA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  BossB() 
    {
        super(180,50);
    while( i<=360)
            {
                fire.add(new Type1(i));
                i+=45;
            }
        while( k<=360)
            {
                fire.add(new Type2(k));
                k+=45;
            }
    }    

    public void spray()
    {
        World world = getWorld();

        for (Bullets x:fire )
        {
            world.addObject(x,this.getX(),this.getY());
        }
     }
    

    public void nextboss()
    {
        World world = getWorld();

        BossC bossC = new BossC();
        world.addObject(bossC,this.getX(),this.getY());
        world.removeObject(this);
    }
}
