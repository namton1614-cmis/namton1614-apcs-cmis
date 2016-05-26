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
        addObject(water4,5,6);
        Water water5 = new Water();
        addObject(water5,5,7);
        Water water6 = new Water();
        addObject(water6,5,8);
        Water water7 = new Water();
        addObject(water7,7,8);
        Water water8 = new Water();
        addObject(water8,6,8);
        Water water9 = new Water();
        addObject(water9,8,8);
        Water water10 = new Water();
        addObject(water10,9,8);
        Water water11 = new Water();
        addObject(water11,10,8);
        Water water12 = new Water();
        addObject(water12,10,7);
        Water water13 = new Water();
        addObject(water13,10,6);
        Water water14 = new Water();
        addObject(water14,10,5);
        Water water15 = new Water();
        addObject(water15,10,4);
        Water water16 = new Water();
        addObject(water16,10,3);
        Water water17 = new Water();
        addObject(water17,9,3);
        Water water18 = new Water();
        addObject(water18,8,3);
        Water water19 = new Water();
        addObject(water19,7,3);
        Water water20 = new Water();
        addObject(water20,6,3);
        Block block = new Block();
        addObject(block,6,6);
        Block block2 = new Block();
        addObject(block2,6,2);
        Wall wall = new Wall();
        addObject(wall,6,5);
        Wall wall2 = new Wall();
        addObject(wall2,8,4);
        Wall wall3 = new Wall();
        addObject(wall3,9,4);
        Wall wall4 = new Wall();
        addObject(wall4,9,5);
        Wall wall5 = new Wall();
        addObject(wall5,9,6);
        Wall wall6 = new Wall();
        addObject(wall6,9,7);
        Wall wall7 = new Wall();
        addObject(wall7,8,7);
        Wall wall8 = new Wall();
        addObject(wall8,7,7);
        Wall wall9 = new Wall();
        addObject(wall9,6,7);
        Wall wall10 = new Wall();
        addObject(wall10,11,4);
        Wall wall11 = new Wall();
        addObject(wall11,11,5);
        Wall wall12 = new Wall();
        addObject(wall12,11,6);
        Wall wall13 = new Wall();
        addObject(wall13,11,7);
        Wall wall14 = new Wall();
        addObject(wall14,12,8);
        Wall wall15 = new Wall();
        addObject(wall15,12,7);
        Wall wall16 = new Wall();
        addObject(wall16,12,6);
        Wall wall17 = new Wall();
        addObject(wall17,12,5);
        Wall wall18 = new Wall();
        addObject(wall18,12,4);
        Wall wall19 = new Wall();
        addObject(wall19,12,3);
        Wall wall20 = new Wall();
        addObject(wall20,7,2);
        Wall wall21 = new Wall();
        addObject(wall21,5,2);
        Wall wall22 = new Wall();
        addObject(wall22,4,2);
        Wall wall23 = new Wall();
        addObject(wall23,4,3);
        Wall wall24 = new Wall();
        addObject(wall24,3,3);
        Wall wall25 = new Wall();
        addObject(wall25,3,4);
        Wall wall26 = new Wall();
        addObject(wall26,4,5);
        Wall wall27 = new Wall();
        addObject(wall27,8,2);
        Wall wall28 = new Wall();
        addObject(wall28,8,1);
        Wall wall29 = new Wall();
        addObject(wall29,9,2);
        Wall wall30 = new Wall();
        addObject(wall30,10,2);
        Wall wall31 = new Wall();
        addObject(wall31,5,0);
        Wall wall32 = new Wall();
        addObject(wall32,1,0);
        Wall wall33 = new Wall();
        addObject(wall33,1,2);
        Wall wall34 = new Wall();
        addObject(wall34,1,3);
        Wall wall35 = new Wall();
        addObject(wall35,1,4);
        Wall wall36 = new Wall();
        addObject(wall36,1,5);
        Wall wall37 = new Wall();
        addObject(wall37,2,6);
        Wall wall38 = new Wall();
        addObject(wall38,1,6);
        Wall wall39 = new Wall();
        addObject(wall39,2,7);
        Wall wall40 = new Wall();
        addObject(wall40,2,8);
        Wall wall41 = new Wall();
        addObject(wall41,1,8);
        Wall wall42 = new Wall();
        addObject(wall42,1,9);
        Wall wall43 = new Wall();
        addObject(wall43,1,10);
        LeftSnek leftsnek = new LeftSnek();
        addObject(leftsnek,2,9);
        Wall wall44 = new Wall();
        addObject(wall44,4,8);
        Wall wall45 = new Wall();
        addObject(wall45,5,9);
        Wall wall46 = new Wall();
        addObject(wall46,6,10);
        Wall wall47 = new Wall();
        addObject(wall47,6,9);
        Wall wall48 = new Wall();
        addObject(wall48,7,10);
        Wall wall49 = new Wall();
        addObject(wall49,9,9);
        Wall wall50 = new Wall();
        addObject(wall50,9,10);
        Wall wall51 = new Wall();
        addObject(wall51,12,9);
        Wall wall52 = new Wall();
        addObject(wall52,14,10);
        Wall wall53 = new Wall();
        addObject(wall53,14,2);
        Wall wall54 = new Wall();
        addObject(wall54,14,0);
        Wall wall55 = new Wall();
        addObject(wall55,14,0);
        Exit exit = new Exit();
        addObject(exit,15,0);
        Cactus cactus = new Cactus();
        addObject(cactus,4,4);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,4,9);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,11,8);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,8,5);
        Block block3 = new Block();
        addObject(block3,10,9);
        Block block4 = new Block();
        addObject(block4,11,9);
        Block block5 = new Block();
        addObject(block5,1,1);
        Wall wall56 = new Wall();
        addObject(wall56,14,9);
        Wall wall57 = new Wall();
        addObject(wall57,14,8);
        Wall wall58 = new Wall();
        addObject(wall58,14,7);
        Wall wall59 = new Wall();
        addObject(wall59,14,6);
        Wall wall60 = new Wall();
        addObject(wall60,14,5);
        Wall wall61 = new Wall();
        addObject(wall61,14,4);
        Wall wall62 = new Wall();
        addObject(wall62,14,3);
        Robot robot = new Robot();
        addObject(robot,7,9);
    }

    public void newLevel()
    {

        Greenfoot.setWorld(new FINALBOSS());
    }
}
