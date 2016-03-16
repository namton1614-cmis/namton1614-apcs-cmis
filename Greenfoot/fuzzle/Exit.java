import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Impass
{
  /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
               Actor robot;
        robot = getOneObjectAtOffset(0,0,Robot.class);  
        if (robot!=null)
        {
            World world; 
            world = getWorld();
            world.removeObject(robot);
        //  Greenfoot.playSound("win.mp3");
        }
    }    
}
