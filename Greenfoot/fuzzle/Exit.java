import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Object
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Robot robot;
        robot =(Robot) getOneObjectAtOffset(0,0,Robot.class);  
        if (robot!=null)
        {
            Level1 world; 
            world =(Level1) getWorld();
            if (robot.getPlantPower()>=world.getPlant())
            {
                world.removeObject(robot);
            }
            //  Greenfoot.playSound("win.mp3");
        }
    }    
}
