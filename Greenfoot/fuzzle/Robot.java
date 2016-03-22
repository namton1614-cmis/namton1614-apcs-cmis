import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends AbstractRobot
{
    private int plantPower;

    public void increasePlant(int power)
    {
        plantPower+=power;
        World world; 
        world = getWorld();
        world.showText("Plants acquired: " + plantPower, 1, 1);
    }
    
    public int getPlantPower()
    {
    return plantPower;
    }

}
