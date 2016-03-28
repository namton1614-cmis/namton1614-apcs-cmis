import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Collectibles  
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void collect()
    {
        Robot Robot = (Robot)getOneObjectAtOffset(0, 0, Robot.class);
        if (Robot!=null)
        {World world = getWorld();
            world.removeObject(this);
            Robot.increaseBomb();
        }   
    }
}
