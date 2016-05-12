import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FINALBOSS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FINALBOSS extends World
{

    /**
     * Constructor for objects of class FINALBOSS.
     * 
     */
    public FINALBOSS()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        Greenfoot.setSpeed(50);
        prepare();
                setPaintOrder(Fighter.class, Boss.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fighter fighter = new Fighter();
        addObject(fighter,587,621);
        Type1 type1 = new Type1( 75);
        addObject(type1,455,268);
        BossA bossa = new BossA();
        addObject(bossa,620,199);
        Power power = new Power();
        addObject(power,245,290);
    }
}
