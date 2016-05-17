import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TypeE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeE extends MyShots
{
    int counter=0;
    int direction=-1;
    /**
     * Act - do whatever the TypeE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  TypeE() 
    {
        setRotation(315);
    }    

    public void act() 
    {
        attack();
        turn(direction);

        if(getWorld()!=null)
            movement();
    }     

    public void movement( )
    {
        if (  this.isAtEdge()==true )
        {
            World world = getWorld();
            world.removeObject(this);

        }
        else if (counter<100)
        {
            move(4); 
            counter++;

        }
        else 
        {
            counter=0;
            direction*=-1;
        }
    }
}
