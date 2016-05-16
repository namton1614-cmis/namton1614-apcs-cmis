import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Power here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Power extends Final
{
    
    public Power()
    {
    }
     public void act() 
    {
       collect();
        if(getWorld()!=null)
            movement();
    }    

    
        public void movement( )
    {
        if (  this.isAtEdge()==true)
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else
            setLocation(getX(),getY()+4);

    }
    
     public void collect() 
    {
        Fighter Fighter = (Fighter)getOneObjectAtOffset(0, 0, Fighter.class);
        if (Fighter!=null)
        {World world = getWorld();
            world.removeObject(this);
            Fighter.increasePower(25);
        }   
    }
}
