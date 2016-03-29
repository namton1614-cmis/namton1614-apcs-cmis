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
        super(16, 8, 60);   
        prepare();

    }

    private void prepare()
    {

        Robot robot = new Robot();
        addObject(robot,0,7);
        LeftSnek leftsnek2 = new LeftSnek();
        addObject(leftsnek2,2,3);
        RightSnek rightsnek2 = new RightSnek();
        addObject(rightsnek2,10,1);
        Wall wall7 = new Wall();
        addObject(wall7,11,1);
        Wall wall8 = new Wall();
        addObject(wall8,11,2);
        Wall wall9 = new Wall();
        addObject(wall9,11,3);
        Wall wall10 = new Wall();
        addObject(wall10,11,4);
        Wall wall11 = new Wall();
        addObject(wall11,11,5);
        Wall wall12 = new Wall();
        addObject(wall12,11,6);
        Wall wall13 = new Wall();
        addObject(wall13,11,7);
        Water water4 = new Water();
        addObject(water4,13,5);
        Water water5 = new Water();
        addObject(water5,14,5);
        Water water6 = new Water();
        addObject(water6,14,6);
        Water water7 = new Water();
        addObject(water7,15,6);
        Water water8 = new Water();
        addObject(water8,15,5);
        Block block5 = new Block();
        addObject(block5,13,4);
        Wall wall14 = new Wall();
        addObject(wall14,12,5);
        Water water9 = new Water();
        addObject(water9,14,7);
        Block block6 = new Block();
        addObject(block6,13,3);
        Hedgehog hedgehog = new Hedgehog();
        addObject(hedgehog,7,2);
        Block block7 = new Block();
        addObject(block7,1,3);
        Block block8 = new Block();
        addObject(block8,0,3);
        Block block9 = new Block();
        addObject(block9,0,4);
        Block block10 = new Block();
        addObject(block10,1,4);
        Block block11 = new Block();
        addObject(block11,1,5);
        Flower flower3 = new Flower();
        addObject(flower3,15,0);
        Flower flower4 = new Flower();
        addObject(flower4,10,3);
        Flower flower5 = new Flower();
        addObject(flower5,9,3);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,8,6);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,9,6);
        Block block12 = new Block();
        addObject(block12,8,6);
        Block block13 = new Block();
        addObject(block13,8,5);
        block12.setLocation(7,6);
        Block block14 = new Block();
        addObject(block14,9,5);
        Block block15 = new Block();
        addObject(block15,9,7);
        Block block16 = new Block();
        addObject(block16,8,7);
    }
}
