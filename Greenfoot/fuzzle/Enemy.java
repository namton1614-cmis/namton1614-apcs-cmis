import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Object
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    

    public void killRobot()
    {
        Robot robot;
        robot =(Robot) getOneObjectAtOffset(0,0,Robot.class);  
        if (robot!=null)
        {
            World world = getWorld();
            world.removeObject(robot);
            Greenfoot.setWorld(new GameOver());
        }

    }
}
