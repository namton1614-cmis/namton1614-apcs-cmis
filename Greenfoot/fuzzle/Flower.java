import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Collectibles implements Collectible
{
    private int power =1;
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
