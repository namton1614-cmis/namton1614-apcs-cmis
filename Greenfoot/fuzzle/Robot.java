import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends AbstractRobot
{
    private int plantPower;
    private int bombNo =0;
    private int plantRequire =20;
    ArrayList<String> myFamily = new ArrayList<String>(); 
    public Robot()
    {
        super();

        myFamily.add("Required plants:");
        myFamily.add("Plants acquired:" );
        myFamily.add("No of Bombs:" );
    }

    public void increasePlant(int power)
    {
        plantPower+=power;
        World world; 
        world = getWorld();
        world.showText(myFamily.get(0)+plantRequire,2,0);
        world.showText(myFamily.get(1) + plantPower, 2, 1);
    }

    public void increaseBomb()
    {
        bombNo++;
        World world; 
        world = getWorld();
        world.showText(myFamily.get(2) + bombNo , 2, 2);
    }

    public int getPlantPower()
    {
        return plantPower;
    }

    public int getPlantRequired()
    {
        return plantRequire;
    }

    public void bomb()
    {
        if (bombNo>0 && Greenfoot.isKeyDown("x"))
        {
            World world = getWorld();
            Explode Explode = new Explode();
            world.addObject(Explode,this.getX(),this.getY());
            bombNo--;
            world.showText(myFamily.get(2) + bombNo, 2, 2);
        }
    }
}
