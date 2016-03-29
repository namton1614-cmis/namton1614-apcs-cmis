import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Snek extends Impass implements Attack
{
    int direction;
    /**
     * Act - do whatever the Snek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.getRandomNumber(100) >30)
        {
            Actor Object = getOneObjectAtOffset(direction, 0, Object.class);

            if (Object == null) 
                attack();
        }
    }    


}
