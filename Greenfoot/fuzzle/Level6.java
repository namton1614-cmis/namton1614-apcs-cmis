import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level6()
    {    
        super(16, 12, 60);   
 

        prepare();
    }

    private void prepare()
    {

        Water water = new Water();
        addObject(water,5,3);
        Water water2 = new Water();
        addObject(water2,5,4);
        Water water3 = new Water();
        addObject(water3,5,5);
        Water water4 = new Water();
        addObject(water4,5,7);
        Water water5 = new Water();
        addObject(water5,5,6);
        Water water6 = new Water();
        addObject(water6,5,8);
        Water water7 = new Water();
        addObject(water7,6,9);
        Water water8 = new Water();
        addObject(water8,7,8);
        Water water9 = new Water();
        addObject(water9,8,8);
        Water water10 = new Water();
        addObject(water10,9,8);
        Water water11 = new Water();
        addObject(water11,10,8);
        Water water12 = new Water();
        addObject(water12,6,3);
        Water water13 = new Water();
        addObject(water13,7,3);
        Water water14 = new Water();
        addObject(water14,8,3);
        Water water15 = new Water();
        addObject(water15,9,3);
        Water water16 = new Water();
        addObject(water16,10,3);
        Water water17 = new Water();
        addObject(water17,10,4);
        Water water18 = new Water();
        addObject(water18,10,5);
        Water water19 = new Water();
        addObject(water19,10,6);
        Water water20 = new Water();
        addObject(water20,10,7);
        Wall wall = new Wall();
        addObject(wall,6,8);
        Wall wall2 = new Wall();
        addObject(wall2,6,7);
        Wall wall3 = new Wall();
        addObject(wall3,7,7);
        Wall wall4 = new Wall();
        addObject(wall4,8,7);
        Wall wall5 = new Wall();
        addObject(wall5,9,7);
        Wall wall6 = new Wall();
        addObject(wall6,9,6);
        Wall wall7 = new Wall();
        addObject(wall7,9,5);
        Wall wall8 = new Wall();
        addObject(wall8,9,4);

        Wall wall10 = new Wall();
        addObject(wall10,8,4);

        Block block = new Block();
        addObject(block,6,6);
        Cactus cactus = new Cactus();
        addObject(cactus,7,5);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,8,6);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,7,4);
        Block block2 = new Block();
        addObject(block2,6,2);
        Wall wall11 = new Wall();
        addObject(wall11,4,3);
        Wall wall12 = new Wall();
        addObject(wall12,4,2);
        Wall wall13 = new Wall();
        addObject(wall13,5,2);
        Wall wall14 = new Wall();
        addObject(wall14,7,2);
        Wall wall15 = new Wall();
        addObject(wall15,8,2);
        Wall wall16 = new Wall();
        addObject(wall16,9,2);
        Wall wall17 = new Wall();
        addObject(wall17,10,2);
        Wall wall18 = new Wall();
        addObject(wall18,4,5);
        Wall wall19 = new Wall();
        addObject(wall19,3,4);
        Flower flower = new Flower();
        addObject(flower,4,4);
        Flower flower2 = new Flower();
        addObject(flower2,4,4);
        Flower flower3 = new Flower();
        addObject(flower3,11,8);
        Block block3 = new Block();
        addObject(block3,10,9);
        Block block4 = new Block();
        addObject(block4,11,9);
        Exit exit = new Exit();
        addObject(exit,15,0);
        LeftSnek leftsnek = new LeftSnek();
        addObject(leftsnek,2,9);
        Flower flower4 = new Flower();
        addObject(flower4,4,9);
        Wall wall20 = new Wall();
        addObject(wall20,4,8);
        Wall wall21 = new Wall();
        addObject(wall21,5,9);
        Wall wall22 = new Wall();
        addObject(wall22,2,8);
        Wall wall23 = new Wall();
        addObject(wall23,2,6);
        Wall wall24 = new Wall();
        addObject(wall24,2,7);
        Wall wall25 = new Wall();
        addObject(wall25,1,9);
        Wall wall26 = new Wall();
        addObject(wall26,1,5);
        Wall wall27 = new Wall();
        addObject(wall27,1,4);
        Wall wall28 = new Wall();
        addObject(wall28,3,3);
        Wall wall29 = new Wall();
        addObject(wall29,1,3);
        Block block5 = new Block();
        addObject(block5,1,2);
        Wall wall30 = new Wall();
        addObject(wall30,1,1);
        Wall wall31 = new Wall();
        addObject(wall31,11,7);
        Wall wall32 = new Wall();
        addObject(wall32,11,6);
        Wall wall33 = new Wall();
        addObject(wall33,11,5);
        Wall wall34 = new Wall();
        addObject(wall34,11,4);
        Wall wall35 = new Wall();
        addObject(wall35,12,3);
        Wall wall36 = new Wall();
        addObject(wall36,12,4);
        Wall wall37 = new Wall();
        addObject(wall37,12,5);
        Wall wall38 = new Wall();
        addObject(wall38,12,6);
        Wall wall39 = new Wall();
        addObject(wall39,12,7);
        Wall wall40 = new Wall();
        addObject(wall40,6,9);
        Wall wall41 = new Wall();
        addObject(wall41,7,9);
        Wall wall42 = new Wall();
        addObject(wall42,8,9);
        Wall wall43 = new Wall();
        addObject(wall43,13,8);
        Wall wall44 = new Wall();
        addObject(wall44,14,9);
        Wall wall45 = new Wall();
        addObject(wall45,14,1);
        Flower flower5 = new Flower();
        addObject(flower5,0,1);
        Flower flower6 = new Flower();
        addObject(flower6,15,10);
        Robot robot = new Robot();
        addObject(robot,15,2);
        Wall wall46 = new Wall();
        addObject(wall46,14,0);
        Wall wall47 = new Wall();
        addObject(wall47,4,0);
        Wall wall48 = new Wall();
        addObject(wall48,9,1);
        Wall wall49 = new Wall();
        addObject(wall49,10,1);
        Wall wall50 = new Wall();
        addObject(wall50,6,10);
        Wall wall51 = new Wall();
        addObject(wall51,7,10);
        Wall wall52 = new Wall();
        addObject(wall52,1,10);
    }

    public void newLevel()
    {

        Greenfoot.setWorld(new FINALBOSS());
    }
}
