import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{

    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Levels(int l,int w, int s)
    {    

        super(l, w, s); 
        setPaintOrder(Fire.class,AbstractRobot.class,Enemy.class,Object.class);
    }

    public void newLevel()
    {

    }
}
