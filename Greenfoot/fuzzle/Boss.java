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

    public Boss()
    {
        hp=100;
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
}
