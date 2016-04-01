import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(16, 10, 60);   
        setPaintOrder(Fire.class,AbstractRobot.class,Enemy.class,Object.class);

        prepare();
    }

    private void prepare()
    {

        Robot robot = new Robot();
        addObject(robot,0,8);
        Wall wall = new Wall();
        addObject(wall,0,9);
        RightSnek rightsnek = new RightSnek();
        addObject(rightsnek,2,9);
        Wall wall2 = new Wall();
        addObject(wall2,3,9);
        Wall wall3 = new Wall();
        addObject(wall3,4,9);
        LeftSnek leftsnek = new LeftSnek();
        addObject(leftsnek,5,9);
        Cactus cactus = new Cactus();
        addObject(cactus,7,9);
        Flower flower = new Flower();
        addObject(flower,2,8);
        Block block = new Block();
        addObject(block,3,8);
        Wall wall4 = new Wall();
        addObject(wall4,0,6);
        Wall wall5 = new Wall();
        addObject(wall5,2,6);
        Wall wall6 = new Wall();
        addObject(wall6,1,6);
        Wall wall7 = new Wall();
        addObject(wall7,2,6);
        wall7.setLocation(3,6);
        Wall wall8 = new Wall();
        addObject(wall8,4,6);
        Wall wall9 = new Wall();
        addObject(wall9,5,6);
        Wall wall10 = new Wall();
        addObject(wall10,6,6);
        Wall wall11 = new Wall();
        addObject(wall11,8,6);
        Wall wall12 = new Wall();
        addObject(wall12,8,7);
        Wall wall13 = new Wall();
        addObject(wall13,8,9);
        Wall wall14 = new Wall();
        addObject(wall14,8,8);
        Wall wall15 = new Wall();
        addObject(wall15,8,5);
        Wall wall16 = new Wall();
        addObject(wall16,8,4);
        RightSnek rightsnek2 = new RightSnek();
        addObject(rightsnek2,8,3);
        Block block2 = new Block();
        addObject(block2,5,4);
        Block block3 = new Block();
        addObject(block3,3,4);
        Exit exit = new Exit();
        addObject(exit,2,0);
        Wall wall17 = new Wall();
        addObject(wall17,1,0);
        Wall wall18 = new Wall();
        addObject(wall18,3,0);
        Wall wall19 = new Wall();
        addObject(wall19,1,1);
        Wall wall20 = new Wall();
        addObject(wall20,3,1);
        Water water = new Water();
        addObject(water,3,2);
        Water water2 = new Water();
        addObject(water2,2,2);
        Water water3 = new Water();
        addObject(water3,4,2);
        Water water4 = new Water();
        addObject(water4,4,1);
        Water water5 = new Water();
        addObject(water5,4,0);
        Water water6 = new Water();
        addObject(water6,1,2);
        Water water7 = new Water();
        addObject(water7,0,2);
        Water water8 = new Water();
        addObject(water8,0,1);
        Water water9 = new Water();
        addObject(water9,0,0);
        Wall wall21 = new Wall();
        addObject(wall21,9,6);
        Wall wall22 = new Wall();
        addObject(wall22,10,6);
        Wall wall23 = new Wall();
        addObject(wall23,11,6);
        Wall wall24 = new Wall();
        addObject(wall24,12,6);
        Wall wall25 = new Wall();
        addObject(wall25,13,6);
        Wall wall26 = new Wall();
        addObject(wall26,15,3);
        Wall wall27 = new Wall();
        addObject(wall27,15,4);
        Wall wall28 = new Wall();
        addObject(wall28,15,5);
        Wall wall29 = new Wall();
        addObject(wall29,15,6);
        Wall wall30 = new Wall();
        addObject(wall30,15,7);
        Wall wall31 = new Wall();
        addObject(wall31,15,8);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,15,2);
        Flower flower2 = new Flower();
        addObject(flower2,14,9);
        Flower flower3 = new Flower();
        addObject(flower3,13,9);
        Flower flower4 = new Flower();
        addObject(flower4,12,9);
        Flower flower5 = new Flower();
        addObject(flower5,11,9);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,15,1);
        Wall wall32 = new Wall();
        addObject(wall32,15,0);
        Wall wall33 = new Wall();
        addObject(wall33,14,0);
        Wall wall34 = new Wall();
        addObject(wall34,14,1);
    }

    public void newLevel()
    {

        Greenfoot.setWorld(new Level2());
    }
}
