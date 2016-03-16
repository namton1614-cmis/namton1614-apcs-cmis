import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 10, 60);   
        prepare();

    }

    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,0,7);
        Wall wall = new Wall();
        addObject(wall,7,6);
        Wall wall2 = new Wall();
        addObject(wall2,7,8);
    }
}
