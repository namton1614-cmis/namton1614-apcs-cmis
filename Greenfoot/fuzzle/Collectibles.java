import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collectibles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Collectibles extends Object
{
    int power;
    public void collect() 
    {
        Robot Robot = (Robot)getOneObjectAtOffset(0, 0, Robot.class);
        if (Robot!=null)
        {World world = getWorld();
            world.removeObject(this);
            Robot.increasePlant( power);
        }   
    }    

}
