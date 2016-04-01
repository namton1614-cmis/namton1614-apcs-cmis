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
        if (robot!=null&&robot.getPlantPower()>=robot.getPlantRequired())
        {

            Levels world =(Levels) getWorld();
            world.removeObject(this);

            world.removeObject(robot);
            world.newLevel();

            //  Greenfoot.playSound("win.mp3");
        }
    }    
}
