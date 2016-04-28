import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fighter extends Actor
{
    private int direction;

    public Fighter()
    {
        setDirection(2);
    }

    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-16,getY());
    
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+16,getY());
  
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-16);
       
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+16);
    
        }
    }
    
        public void setDirection(int direction)
    {
        this.direction = direction;
        switch(direction) {
            case 3 :
            setRotation(90);
            break;
            case 0 :
            setRotation(0);
            break;
            case 2 :
            setRotation(270);
            break;
            case 1 :
            setRotation(180);
            break;
            default :
            break;
        }
    }
}
