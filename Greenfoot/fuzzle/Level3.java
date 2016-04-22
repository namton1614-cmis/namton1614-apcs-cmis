import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
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
        Robot robot2 = new Robot();
        addObject(robot2,0,9);
        Wall wall46 = new Wall();
        addObject(wall46,1,9);
        Wall wall47 = new Wall();
        addObject(wall47,1,8);
        Wall wall48 = new Wall();
        addObject(wall48,1,6);
        Wall wall49 = new Wall();
        addObject(wall49,1,7);
        Wall wall50 = new Wall();
        addObject(wall50,1,5);
        Wall wall51 = new Wall();
        addObject(wall51,1,4);
        Wall wall52 = new Wall();
        addObject(wall52,1,3);
        Wall wall53 = new Wall();
        addObject(wall53,1,2);
        Wall wall54 = new Wall();
        addObject(wall54,2,2);
        Wall wall55 = new Wall();
        addObject(wall55,4,2);
        Wall wall56 = new Wall();
        addObject(wall56,6,2);
        Wall wall57 = new Wall();
        addObject(wall57,8,2);
        Wall wall58 = new Wall();
        addObject(wall58,10,2);
        Water water17 = new Water();
        addObject(water17,2,9);
        Water water18 = new Water();
        addObject(water18,3,9);
        Water water19 = new Water();
        addObject(water19,4,9);
        Water water20 = new Water();
        addObject(water20,5,9);
        Water water21 = new Water();
        addObject(water21,6,9);
        Water water22 = new Water();
        addObject(water22,7,9);
        Water water23 = new Water();
        addObject(water23,7,8);
        Water water24 = new Water();
        addObject(water24,8,8);
        Water water25 = new Water();
        addObject(water25,8,9);
        Water water26 = new Water();
        addObject(water26,9,9);
        Water water27 = new Water();
        addObject(water27,9,8);
        Water water28 = new Water();
        addObject(water28,10,7);
        Water water29 = new Water();
        addObject(water29,10,8);
        Water water30 = new Water();
        addObject(water30,10,9);
        Water water31 = new Water();
        addObject(water31,11,9);
        Water water32 = new Water();
        addObject(water32,11,8);
        Water water33 = new Water();
        addObject(water33,12,8);
        Water water34 = new Water();
        addObject(water34,12,9);
        Water water35 = new Water();
        addObject(water35,13,9);
        Water water36 = new Water();
        addObject(water36,13,8);
        Water water37 = new Water();
        addObject(water37,14,8);
        Water water38 = new Water();
        addObject(water38,14,9);
        Water water39 = new Water();
        addObject(water39,15,9);
        Water water40 = new Water();
        addObject(water40,15,8);
        Water water41 = new Water();
        addObject(water41,15,7);
        Water water42 = new Water();
        addObject(water42,15,5);
        Water water43 = new Water();
        addObject(water43,15,6);
        Water water44 = new Water();
        addObject(water44,11,7);
        Water water45 = new Water();
        addObject(water45,12,7);
        Water water46 = new Water();
        addObject(water46,14,7);
        Water water47 = new Water();
        addObject(water47,13,7);
        Water water48 = new Water();
        addObject(water48,14,6);
        Water water49 = new Water();
        addObject(water49,15,4);
        Water water50 = new Water();
        addObject(water50,15,3);
        RightSnek rightsnek = new RightSnek();
        addObject(rightsnek,14,3);
        RightSnek rightsnek2 = new RightSnek();
        addObject(rightsnek2,13,6);
        RightSnek rightsnek3 = new RightSnek();
        addObject(rightsnek3,2,5);
        RightSnek rightsnek4 = new RightSnek();
        addObject(rightsnek4,14,5);
        removeObject(rightsnek3);
        LeftSnek leftsnek = new LeftSnek();
        addObject(leftsnek,2,5);
        Block block10 = new Block();
        addObject(block10,8,5);
        Block block11 = new Block();
        addObject(block11,5,6);
        Block block12 = new Block();
        addObject(block12,6,8);
        Block block13 = new Block();
        addObject(block13,7,7);
        Block block14 = new Block();
        addObject(block14,3,7);
        Flower flower11 = new Flower();
        addObject(flower11,11,3);
        Flower flower12 = new Flower();
        addObject(flower12,4,5);
        flower12.setLocation(2,4);
        Flower flower13 = new Flower();
        addObject(flower13,12,5);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,10,6);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,10,1);
        Cactus cactus5 = new Cactus();
        addObject(cactus5,9,5);
        Flower flower14 = new Flower();
        addObject(flower14,3,2);
        Flower flower15 = new Flower();
        addObject(flower15,5,2);
        Exit exit2 = new Exit();
        addObject(exit2,15,2);
        rightsnek.setLocation(13,3);
        rightsnek.setLocation(12,3);
        Water water52 = new Water();
        addObject(water52,14,3);
        Water water53 = new Water();
        addObject(water53,6,7);
    }
}
