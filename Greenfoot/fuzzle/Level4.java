import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends Levels
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {
        super(16, 10, 60);   
        setPaintOrder(Fire.class,AbstractRobot.class,Enemy.class,Object.class);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall wall = new Wall();
        addObject(wall,6,6);
        Wall wall2 = new Wall();
        addObject(wall2,6,7);
        Wall wall3 = new Wall();
        addObject(wall3,6,8);
        Wall wall4 = new Wall();
        addObject(wall4,6,9);
        Block block = new Block();
        addObject(block,7,8);
        Block block2 = new Block();
        addObject(block2,8,7);
        Block block3 = new Block();
        addObject(block3,7,6);
        Block block4 = new Block();
        addObject(block4,9,8);
        Block block5 = new Block();
        addObject(block5,9,6);
        Cactus cactus = new Cactus();
        addObject(cactus,8,9);
        Wall wall5 = new Wall();
        addObject(wall5,10,6);
        Wall wall6 = new Wall();
        addObject(wall6,10,7);
        Wall wall7 = new Wall();
        addObject(wall7,10,8);
        Wall wall8 = new Wall();
        addObject(wall8,10,9);
        Wall wall9 = new Wall();
        addObject(wall9,7,5);
        Wall wall10 = new Wall();
        addObject(wall10,6,5);
        Wall wall11 = new Wall();
        addObject(wall11,9,5);
        Wall wall12 = new Wall();
        addObject(wall12,10,5);
        Wall wall13 = new Wall();
        addObject(wall13,5,5);
        Water water = new Water();
        addObject(water,5,8);
        Water water2 = new Water();
        addObject(water2,4,8);
        Water water3 = new Water();
        addObject(water3,3,8);
        Water water4 = new Water();
        addObject(water4,3,7);
        Water water5 = new Water();
        addObject(water5,4,7);
        Water water6 = new Water();
        addObject(water6,5,7);
        Water water7 = new Water();
        addObject(water7,5,6);
        Water water8 = new Water();
        addObject(water8,4,6);
        Water water9 = new Water();
        addObject(water9,3,6);
        Wall wall14 = new Wall();
        addObject(wall14,3,5);
        Wall wall15 = new Wall();
        addObject(wall15,2,5);
        Wall wall16 = new Wall();
        addObject(wall16,2,6);
        Wall wall17 = new Wall();
        addObject(wall17,2,7);
        Wall wall18 = new Wall();
        addObject(wall18,2,9);
        Wall wall19 = new Wall();
        addObject(wall19,2,8);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,4,9);
        Bomb bomb = new Bomb();
        addObject(bomb,0,9);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,1,9);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,1,8);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,0,8);
        Water water10 = new Water();
        addObject(water10,1,7);
        Water water11 = new Water();
        addObject(water11,0,7);
        Block block6 = new Block();
        addObject(block6,2,1);
        Block block7 = new Block();
        addObject(block7,2,2);
        Block block8 = new Block();
        addObject(block8,3,3);
        Block block9 = new Block();
        addObject(block9,4,3);
        Block block10 = new Block();
        addObject(block10,5,2);
        Block block11 = new Block();
        addObject(block11,5,1);
        Block block12 = new Block();
        addObject(block12,4,0);
        Block block13 = new Block();
        addObject(block13,3,0);
        Wall wall20 = new Wall();
        addObject(wall20,2,0);
        Wall wall21 = new Wall();
        addObject(wall21,2,3);
        Wall wall22 = new Wall();
        addObject(wall22,5,3);
        Wall wall23 = new Wall();
        addObject(wall23,5,0);
        RightSnek rightsnek = new RightSnek();
        addObject(rightsnek,14,2);
        RightSnek rightsnek2 = new RightSnek();
        addObject(rightsnek2,14,1);
        Wall wall24 = new Wall();
        addObject(wall24,11,0);
        Wall wall25 = new Wall();
        addObject(wall25,11,1);
        Wall wall26 = new Wall();
        addObject(wall26,11,1);
        Wall wall27 = new Wall();
        addObject(wall27,11,2);
        Wall wall28 = new Wall();
        addObject(wall28,11,3);
        Wall wall29 = new Wall();
        addObject(wall29,12,3);
        Wall wall30 = new Wall();
        addObject(wall30,15,2);
        Wall wall31 = new Wall();
        addObject(wall31,13,3);
        Wall wall32 = new Wall();
        addObject(wall32,13,8);
        Wall wall33 = new Wall();
        addObject(wall33,13,9);
        Wall wall34 = new Wall();
        addObject(wall34,15,8);
        Wall wall35 = new Wall();
        addObject(wall35,15,9);
        Block block14 = new Block();
        addObject(block14,14,8);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,14,9);
        Wall wall36 = new Wall();
        addObject(wall36,15,3);
        Wall wall37 = new Wall();
        addObject(wall37,15,1);
        Wall wall38 = new Wall();
        addObject(wall38,15,0);
        Water water12 = new Water();
        addObject(water12,9,0);
        Water water13 = new Water();
        addObject(water13,9,1);
        Water water14 = new Water();
        addObject(water14,10,1);
        Exit exit = new Exit();
        addObject(exit,10,0);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,13,0);
        Hedgehog hedgehog = new Hedgehog();
        addObject(hedgehog,9,4);
        Robot robot = new Robot();
        addObject(robot,13,7);
        Block block15 = new Block();
        addObject(block15,11,6);
    }
}
