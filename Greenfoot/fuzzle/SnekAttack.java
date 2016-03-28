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
        movement();
        if(getWorld()!=null)
            attack();
    }    

    public void attack()
    {
        Robot robot;
        robot =(Robot) getOneObjectAtOffset(0,0,Robot.class);  
        if (robot!=null)
        {
            Level1 world; 
            world =(Level1) getWorld();
            world.removeObject(robot);
            world.removeObject(this);
        }
    }

    public void movement( )
    {
        Actor object = getOneObjectAtOffset(direction, 0, Object.class);
        if (object!=null || this.isAtEdge()==true)
        {
            Level1 world; 
            world =(Level1) getWorld();
            world.removeObject(this);
        }
        else
            move(direction);

    }
}
