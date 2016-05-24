import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends Levels
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {
        super(16, 10, 60);   

        prepare();
    }

    private void prepare()
    {

        Block block = new Block();
        addObject(block,7,3);
        Block block2 = new Block();
        addObject(block2,8,3);
        Block block3 = new Block();
        addObject(block3,8,4);
        Block block4 = new Block();
        addObject(block4,8,5);
        Block block5 = new Block();
        addObject(block5,6,5);
        Block block6 = new Block();
        addObject(block6,7,5);
        Block block7 = new Block();
        addObject(block7,6,4);
        Block block8 = new Block();
        addObject(block8,6,3);
        Water water = new Water();
        addObject(water,8,2);
        Water water2 = new Water();
        addObject(water2,9,2);
        Water water3 = new Water();
        addObject(water3,9,3);
        Water water4 = new Water();
        addObject(water4,9,4);
        Water water5 = new Water();
        addObject(water5,9,5);
        Water water6 = new Water();
        addObject(water6,10,5);
        Water water7 = new Water();
        addObject(water7,10,4);
        Water water8 = new Water();
        addObject(water8,10,3);
        Water water9 = new Water();
        addObject(water9,9,6);
        Water water10 = new Water();
        addObject(water10,8,6);
        Water water11 = new Water();
        addObject(water11,8,7);
        Water water12 = new Water();
        addObject(water12,7,6);
        Water water13 = new Water();
        addObject(water13,7,7);
        Water water14 = new Water();
        addObject(water14,6,6);
        Water water15 = new Water();
        addObject(water15,6,7);
        Water water16 = new Water();
        addObject(water16,5,6);
        Water water17 = new Water();
        addObject(water17,5,5);
        Water water18 = new Water();
        addObject(water18,4,5);
        Water water19 = new Water();
        addObject(water19,4,4);
        Water water20 = new Water();
        addObject(water20,5,4);
        Water water21 = new Water();
        addObject(water21,4,3);
        Water water22 = new Water();
        addObject(water22,5,3);
        Water water23 = new Water();
        addObject(water23,5,2);
        Water water24 = new Water();
        addObject(water24,6,2);
        Water water25 = new Water();
        addObject(water25,7,2);
        Water water26 = new Water();
        addObject(water26,6,1);
        Water water27 = new Water();
        addObject(water27,7,1);

        Water water28 = new Water();
        addObject(water28,8,1);

        Robot robot = new Robot();
        addObject(robot,7,4);
        RightSnek rightsnek = new RightSnek();
        addObject(rightsnek,15,8);
        LeftSnek leftsnek = new LeftSnek();
        addObject(leftsnek,9,7);
        Wall wall = new Wall();
        addObject(wall,7,8);
        Cactus cactus = new Cactus();
        addObject(cactus,7,9);
        RightSnek rightsnek2 = new RightSnek();
        addObject(rightsnek2,15,9);
        Exit exit = new Exit();
        addObject(exit,0,9);
        LeftSnek leftsnek2 = new LeftSnek();
        addObject(leftsnek2,0,8);
        LeftSnek leftsnek3 = new LeftSnek();
        addObject(leftsnek3,9,1);
        RightSnek rightsnek3 = new RightSnek();
        addObject(rightsnek3,4,2);
        Bomb bomb = new Bomb();
        addObject(bomb,1,0);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,0,0);
        Block block9 = new Block();
        addObject(block9,1,1);
        Block block10 = new Block();
        addObject(block10,4,1);
        Block block11 = new Block();
        addObject(block11,12,2);
        Wall wall2 = new Wall();
        addObject(wall2,11,3);
        Wall wall3 = new Wall();
        addObject(wall3,11,4);
        Wall wall4 = new Wall();
        addObject(wall4,11,5);
        Wall wall5 = new Wall();
        addObject(wall5,11,6);
        Wall wall6 = new Wall();
        addObject(wall6,3,6);
        Wall wall7 = new Wall();
        addObject(wall7,3,3);
        Wall wall8 = new Wall();
        addObject(wall8,3,4);
        Wall wall9 = new Wall();
        addObject(wall9,3,5);

        Wall wall10 = new Wall();
        addObject(wall10,12,4);
        Wall wall11 = new Wall();
        addObject(wall11,13,4);
        Wall wall12 = new Wall();
        addObject(wall12,14,4);
        Wall wall13 = new Wall();
        addObject(wall13,2,4);
        Wall wall14 = new Wall();
        addObject(wall14,1,4);
        Flower flower = new Flower();
        addObject(flower,15,0);
        Flower flower2 = new Flower();
        addObject(flower2,14,0);
        Flower flower3 = new Flower();
        addObject(flower3,13,0);
        Flower flower4 = new Flower();
        addObject(flower4,12,0);
        Flower flower5 = new Flower();
        addObject(flower5,15,4);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,0,4);
        Wall wall15 = new Wall();
        addObject(wall15,5,8);
        Wall wall16 = new Wall();
        addObject(wall16,4,7);
        Water water29 = new Water();
        addObject(water29,6,9);
        Wall wall17 = new Wall();
        addObject(wall17,10,6);
        Wall wall18 = new Wall();
        addObject(wall18,8,8);
        Wall wall19 = new Wall();
        addObject(wall19,8,0);
        Wall wall20 = new Wall();
        addObject(wall20,7,0);
        Wall wall21 = new Wall();
        addObject(wall21,6,0);
        Water water30 = new Water();
        addObject(water30,5,0);
    }

    public void newLevel()
    {

        Greenfoot.setWorld(new FINALBOSS());
    }
}
