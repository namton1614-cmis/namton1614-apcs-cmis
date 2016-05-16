import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Type1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Type2 extends Bullets
{
    /**
     * Act - do whatever the Type1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Type2( int direction ) 
    {
        super(1);
        setRotation(direction);
    }    
}
