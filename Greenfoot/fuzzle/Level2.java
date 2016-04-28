import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16, 10, 60);   

        prepare();

    }

    private void prepare()
    {

        Robot robot = new Robot();
        addObject(robot,0,0);
        Wall wall = new Wall();
        addObject(wall,1,1);
        Water water = new Water();
        addObject(water,0,1);
        Wall wall2 = new Wall();
        addObject(wall2,2,1);
        Wall wall3 = new Wall();
        addObject(wall3,3,1);
        Wall wall4 = new Wall();
        addObject(wall4,1,3);
        Block block = new Block();
        addObject(block,1,4);
        Block block2 = new Block();
        addObject(block2,1,5);
        Water water2 = new Water();
        addObject(water2,2,4);
        Water water3 = new Water();
        addObject(water3,2,5);
        Water water4 = new Water();
        addObject(water4,2,6);
        Water water5 = new Water();
        addObject(water5,2,8);
        Water water6 = new Water();
        addObject(water6,2,7);
        Water water7 = new Water();
        addObject(water7,3,7);
        Water water8 = new Water();
        addObject(water8,3,6);
        Water water9 = new Water();
        addObject(water9,3,8);
        Exit exit = new Exit();
        addObject(exit,3,9);
        Water water10 = new Water();
        addObject(water10,4,8);
        Water water11 = new Water();
        addObject(water11,4,7);
        Water water12 = new Water();
        addObject(water12,5,7);
        Water water13 = new Water();
        addObject(water13,5,8);
        Water water14 = new Water();
        addObject(water14,5,9);
        Wall wall5 = new Wall();
        addObject(wall5,1,8);
        Wall wall6 = new Wall();
        addObject(wall6,1,9);
        Wall wall7 = new Wall();
        addObject(wall7,0,9);
        Wall wall8 = new Wall();
        addObject(wall8,0,8);
        Wall wall9 = new Wall();
        addObject(wall9,2,3);
        Wall wall10 = new Wall();
        addObject(wall10,3,3);
        Wall wall11 = new Wall();
        addObject(wall11,4,3);
        Wall wall12 = new Wall();
        addObject(wall12,4,1);
        Wall wall13 = new Wall();
        addObject(wall13,5,1);
        Wall wall14 = new Wall();
        addObject(wall14,6,1);
        Wall wall15 = new Wall();
        addObject(wall15,8,1);
        Wall wall16 = new Wall();
        addObject(wall16,8,2);
        Wall wall17 = new Wall();
        addObject(wall17,8,3);
        Wall wall18 = new Wall();
        addObject(wall18,5,3);
        Wall wall19 = new Wall();
        addObject(wall19,6,3);
        Wall wall20 = new Wall();
        addObject(wall20,7,3);
        Wall wall21 = new Wall();
        addObject(wall21,9,1);
        Wall wall22 = new Wall();
        addObject(wall22,10,1);
        Wall wall23 = new Wall();
        addObject(wall23,11,1);
        Wall wall24 = new Wall();
        addObject(wall24,11,3);
        Wall wall25 = new Wall();
        addObject(wall25,11,2);
        Wall wall26 = new Wall();
        addObject(wall26,12,3);
        Wall wall27 = new Wall();
        addObject(wall27,13,3);
        Wall wall28 = new Wall();
        addObject(wall28,14,3);
        Wall wall29 = new Wall();
        addObject(wall29,15,3);
        Cactus cactus = new Cactus();
        addObject(cactus,14,2);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,15,2);
        Flower flower = new Flower();
        addObject(flower,13,1);
        Flower flower2 = new Flower();
        addObject(flower2,14,1);
        Flower flower3 = new Flower();
        addObject(flower3,15,0);
        Flower flower4 = new Flower();
        addObject(flower4,12,2);
        Block block3 = new Block();
        addObject(block3,13,0);
        Flower flower5 = new Flower();
        addObject(flower5,9,3);
        Flower flower6 = new Flower();
        addObject(flower6,10,3);
        Wall wall30 = new Wall();
        addObject(wall30,3,5);
        Wall wall31 = new Wall();
        addObject(wall31,4,5);
        Wall wall32 = new Wall();
        addObject(wall32,5,5);
        Wall wall33 = new Wall();
        addObject(wall33,6,5);
        Wall wall34 = new Wall();
        addObject(wall34,7,5);
        Wall wall35 = new Wall();
        addObject(wall35,8,5);
        Wall wall36 = new Wall();
        addObject(wall36,9,5);
        Wall wall37 = new Wall();
        addObject(wall37,10,5);
        Wall wall38 = new Wall();
        addObject(wall38,11,5);
        Block block4 = new Block();
        addObject(block4,12,5);
        Block block5 = new Block();
        addObject(block5,13,5);
        Block block6 = new Block();
        addObject(block6,14,5);
        Block block7 = new Block();
        addObject(block7,15,5);
        Wall wall39 = new Wall();
        addObject(wall39,9,6);
        Wall wall40 = new Wall();
        addObject(wall40,9,9);
        Wall wall41 = new Wall();
        addObject(wall41,9,8);
        block4.setLocation(15,6);
        block5.setLocation(14,6);
        Wall wall42 = new Wall();
        addObject(wall42,12,5);
        Wall wall43 = new Wall();
        addObject(wall43,13,5);
        Flower flower7 = new Flower();
        addObject(flower7,10,7);
        Flower flower8 = new Flower();
        addObject(flower8,12,9);
        Flower flower9 = new Flower();
        addObject(flower9,13,8);
        Flower flower10 = new Flower();
        addObject(flower10,14,8);
        Wall wall44 = new Wall();
        addObject(wall44,14,9);
        Wall wall45 = new Wall();
        addObject(wall45,15,9);
        Block block8 = new Block();
        addObject(block8,15,4);
        Hedgehog hedgehog = new Hedgehog();
        addObject(hedgehog,9,4);
        Water water15 = new Water();
        addObject(water15,6,9);
        Water water16 = new Water();
        addObject(water16,7,9);
        Block block9 = new Block();
        addObject(block9,9,7);
    }
    
        public void newLevel()
    {

        Greenfoot.setWorld(new Level3());
    }
}
