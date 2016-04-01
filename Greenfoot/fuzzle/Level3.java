import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
         super(16, 10, 60);   
        setPaintOrder(Fire.class,AbstractRobot.class,Enemy.class,Object.class);

    }
}
