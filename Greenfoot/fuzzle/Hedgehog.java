import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hedgehog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hedgehog extends Enemy
{

    private int direction=1;
    /**
     * Act - do whatever the Hedgehog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        attack();
    }    

    public void attack()
    {
        Robot robot;
        robot =(Robot) getOneObjectAtOffset(0,0,Robot.class);  
        if (robot!=null)
        {
            World world = getWorld();
            world.removeObject(robot);

        }
    }

    public void movement()
    {

        if (Greenfoot.getRandomNumber(100) <10)
        {
            Actor object = getOneObjectAtOffset(direction, 0, Object.class);
            if (object!=null || this.isAtEdge()==true)
            {
                turn(180);
                direction*=-1;
                getImage().mirrorVertically();
                System.out.print(object);
                if (this.isAtEdge()==true)
                {
                    Actor object2 = getOneObjectAtOffset(direction, 0, Object.class);
                    if (object2==null)
                        move(1);
                }
            }
            else
                move(1);
        }
    }
}
