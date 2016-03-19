import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16, 8, 60);   
        prepare();
    }

    private void prepare()
    {

        Water water = new Water();
        addObject(water,10,4);
        Water water2 = new Water();
        addObject(water2,10,5);
        Water water3 = new Water();
        addObject(water3,11,4);
        Robot robot = new Robot();
        addObject(robot,3,5);
        Block block = new Block();
        addObject(block,6,5);
        Block block2 = new Block();
        addObject(block2,6,3);
        Exit exit = new Exit();
        addObject(exit,13,3);
        Wall wall = new Wall();
        addObject(wall,8,3);
        Wall wall2 = new Wall();
        addObject(wall2,8,4);
        Wall wall3 = new Wall();
        addObject(wall3,8,5);
    Flower flower = new Flower();
addObject(flower,6,1);
Flower flower2 = new Flower();
addObject(flower2,10,1);
Cactus cactus = new Cactus();
addObject(cactus,8,6);
Cactus cactus2 = new Cactus();
addObject(cactus2,11,7);
}

}
