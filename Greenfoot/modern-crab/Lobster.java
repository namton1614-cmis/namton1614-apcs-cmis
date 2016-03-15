import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        eat();
    }    

    public void movement()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100) <10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }

    public void eat()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0,0,Crab.class);  
        if (crab!=null)
        {
            World world; 
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("eating.wav");
        }
    }
}
