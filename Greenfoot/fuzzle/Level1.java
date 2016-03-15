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
                  Greenfoot.playSound("1 - Hiroshige No. 36 ~ Neo Super-Express.mp3");
    }

    private void prepare()
    {

        Robot robot = new Robot();
        addObject(robot,0,7);
        Exit exit = new Exit();
        addObject(exit,14,1);
        Block block = new Block();
        addObject(block,7,4);
        Block block2 = new Block();
        addObject(block2,7,2);
        Block block3 = new Block();
        addObject(block3,9,2);
        Block block4 = new Block();
        addObject(block4,8,4);
        Block block5 = new Block();
        addObject(block5,8,3);
        Block block6 = new Block();
        addObject(block6,9,3);
        Block block7 = new Block();
        addObject(block7,9,5);
        Block block8 = new Block();
        addObject(block8,8,6);
        Block block9 = new Block();
        addObject(block9,9,7);
        Block block10 = new Block();
        addObject(block10,9,0);
        Block block11 = new Block();
        addObject(block11,10,7);
        Block block12 = new Block();
        addObject(block12,10,6);
        Wall wall = new Wall();
        addObject(wall,6,0);
        Wall wall2 = new Wall();
        addObject(wall2,7,0);
        Wall wall3 = new Wall();
        addObject(wall3,8,0);
        Wall wall4 = new Wall();
        addObject(wall4,10,0);
        Wall wall5 = new Wall();
        addObject(wall5,9,0);
        wall5.setLocation(11,0);
        removeObject(block10);
        Wall wall6 = new Wall();
        addObject(wall6,9,0);
        Wall wall7 = new Wall();
        addObject(wall7,12,0);
        Wall wall8 = new Wall();
        addObject(wall8,12,0);
        Wall wall9 = new Wall();
        addObject(wall9,13,0);
        Wall wall10 = new Wall();
        addObject(wall10,14,0);
        Wall wall11 = new Wall();
        addObject(wall11,15,0);
        Wall wall12 = new Wall();
        addObject(wall12,15,0);
        removeObject(wall12);
        removeObject(exit);
        removeObject(wall5);
        removeObject(wall8);
        removeObject(wall9);
        removeObject(wall10);
        removeObject(wall11);
        removeObject(wall7);
        removeObject(wall4);
        Wall wall13 = new Wall();
        addObject(wall13,10,0);
        Wall wall14 = new Wall();
        addObject(wall14,11,0);
        Wall wall15 = new Wall();
        addObject(wall15,12,0);
        Wall wall16 = new Wall();
        addObject(wall16,13,0);
        Wall wall17 = new Wall();
        addObject(wall17,14,0);
        Wall wall18 = new Wall();
        addObject(wall18,15,0);
        Wall wall19 = new Wall();
        addObject(wall19,15,1);
        Wall wall20 = new Wall();
        addObject(wall20,15,2);
        Wall wall21 = new Wall();
        addObject(wall21,15,3);
        Wall wall22 = new Wall();
        addObject(wall22,15,4);
        Wall wall23 = new Wall();
        addObject(wall23,15,6);
        Wall wall24 = new Wall();
        addObject(wall24,15,5);
        Wall wall25 = new Wall();
        addObject(wall25,15,7);
        Wall wall26 = new Wall();
        addObject(wall26,14,7);
        Wall wall27 = new Wall();
        addObject(wall27,12,7);
        Wall wall28 = new Wall();
        addObject(wall28,13,7);
        Wall wall29 = new Wall();
        addObject(wall29,11,7);
        block11.setLocation(11,6);
        block9.setLocation(11,5);
        Wall wall30 = new Wall();
        addObject(wall30,10,7);
        Wall wall31 = new Wall();
        addObject(wall31,9,7);
        Wall wall32 = new Wall();
        addObject(wall32,8,7);
        Wall wall33 = new Wall();
        addObject(wall33,7,7);
        Wall wall34 = new Wall();
        addObject(wall34,5,7);
        Wall wall35 = new Wall();
        addObject(wall35,6,7);
        Wall wall36 = new Wall();
        addObject(wall36,3,7);
        Wall wall37 = new Wall();
        addObject(wall37,4,7);
        Wall wall38 = new Wall();
        addObject(wall38,2,7);
        Wall wall39 = new Wall();
        addObject(wall39,1,7);
        Wall wall40 = new Wall();
        addObject(wall40,0,6);
        Wall wall41 = new Wall();
        addObject(wall41,0,5);
        Wall wall42 = new Wall();
        addObject(wall42,0,4);
        Wall wall43 = new Wall();
        addObject(wall43,0,3);
        Wall wall44 = new Wall();
        addObject(wall44,0,1);
        Wall wall45 = new Wall();
        addObject(wall45,0,2);
        Wall wall46 = new Wall();
        addObject(wall46,0,0);
        Wall wall47 = new Wall();
        addObject(wall47,1,0);
        Wall wall48 = new Wall();
        addObject(wall48,2,0);
        Wall wall49 = new Wall();
        addObject(wall49,3,0);
        Wall wall50 = new Wall();
        addObject(wall50,5,0);
        Wall wall51 = new Wall();
        addObject(wall51,4,0);
        robot.setLocation(2,6);
        Wall wall52 = new Wall();
        addObject(wall52,0,7);
        robot.setLocation(1,6);
        Exit exit2 = new Exit();
        addObject(exit2,13,2);
        removeObject(block6);
        removeObject(block3);
        removeObject(block);
        removeObject(block7);
        removeObject(block12);
        removeObject(block11);
        Wall wall53 = new Wall();
        addObject(wall53,5,6);
        Wall wall54 = new Wall();
        addObject(wall54,5,5);
        Wall wall55 = new Wall();
        addObject(wall55,5,4);
        removeObject(block4);
        removeObject(block5);
        removeObject(block2);
        removeObject(block8);
        removeObject(block9);
        Wall wall56 = new Wall();
        addObject(wall56,5,2);
        Wall wall57 = new Wall();
        addObject(wall57,4,2);
        Wall wall58 = new Wall();
        addObject(wall58,6,4);
        Wall wall59 = new Wall();
        addObject(wall59,7,4);
        Wall wall60 = new Wall();
        addObject(wall60,8,4);
        Wall wall61 = new Wall();
        addObject(wall61,11,2);
        Wall wall62 = new Wall();
        addObject(wall62,11,3);
        Wall wall63 = new Wall();
        addObject(wall63,11,4);
        Wall wall64 = new Wall();
        addObject(wall64,10,4);
        Wall wall65 = new Wall();
        addObject(wall65,11,1);
        Wall wall66 = new Wall();
        addObject(wall66,9,2);
        Block block13 = new Block();
        addObject(block13,9,3);
        Block block14 = new Block();
        addObject(block14,5,3);
        Block block15 = new Block();
        addObject(block15,9,5);
        Block block16 = new Block();
        addObject(block16,13,5);
        Block block17 = new Block();
        addObject(block17,12,5);
        Block block18 = new Block();
        addObject(block18,14,5);
        Wall wall67 = new Wall();
        addObject(wall67,5,1);
        Wall wall68 = new Wall();
        addObject(wall68,2,2);
        Block block19 = new Block();
        addObject(block19,3,3);
        Block block20 = new Block();
        addObject(block20,3,4);
        Wall wall69 = new Wall();
        addObject(wall69,12,3);
        Wall wall70 = new Wall();
        addObject(wall70,14,3);
    }

}
