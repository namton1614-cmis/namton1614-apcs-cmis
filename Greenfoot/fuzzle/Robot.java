import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    
    public void increasePlant(int power)
    {
        plantPower+=power;
        World world; 
        world = getWorld();
        world.showText("Required plants ="+plantRequire,2,0);
        world.showText("Plants acquired: " + plantPower, 1, 1);
    }

    public void increaseBomb()
    {
        bombNo++;
        World world; 
        world = getWorld();
        world.showText("No of Bombs: " + bombNo, 1, 2);
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
            world.showText("No of Bombs: " + bombNo, 1, 2);
        }
    }
}
