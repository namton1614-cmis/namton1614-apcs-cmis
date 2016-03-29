import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnekAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class SnekAttack extends Enemy
{ 
    int direction=0;
    public void act() 
    {

        attack();
        if(getWorld()!=null)
            movement();

    }    

    public void attack()
    {
        Robot robot;
        robot =(Robot) getOneObjectAtOffset(0,0,Robot.class);  
        if (robot!=null)
        {
            World world = getWorld();
            world.removeObject(robot);
            world.removeObject(this);
        }
    }

    public void movement( )
    {
        Actor object = getOneObjectAtOffset(direction, 0, Object.class);
        if (object!=null || this.isAtEdge()==true)
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else
            move(direction);

    }
}
