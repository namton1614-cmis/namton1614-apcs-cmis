import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TypeD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeD extends MyShots
{
    /**
     * Act - do whatever the TypeD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  TypeD() 
    {
        setRotation(270);
    }    

    public void act() 
    {
        attack();
       
        turnTowards(40.getX(), 40.getY());
        move(9);
    }    
}
