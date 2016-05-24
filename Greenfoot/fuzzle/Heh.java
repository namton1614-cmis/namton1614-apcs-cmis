import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heh extends Actor
{
    int zero=0;
    /**
     * Act - do whatever the Heh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        zero++;
        GameOver world = (GameOver) getWorld();
        if(zero>100)
        {
            world.newLevel();
        }
    }    
}
