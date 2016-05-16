import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bullets extends Final
{
    int direction=1;
    int counter=0;
    int turn;
    public Bullets(int turn)
    {
    this.turn=turn;
    }
    public void act() 
    {
        attack();
        if (direction==1)
        {
            turn(turn);
            direction*=-1;
        }
        else if (direction==-1)
        {

            direction*=-1;
        }
        if(getWorld()!=null)
            movement();
    }    

    public void attack()
    {
        Fighter fighter;
        fighter =(Fighter) getOneObjectAtOffset(0,0,Fighter.class);  
        if (fighter!=null)
        {
            World world = getWorld();
            world.removeObject(fighter);
            Greenfoot.setWorld(new GameOver());
        }
    }

    public void movement( )
    {
        if (  this.isAtEdge()==true)
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else if (counter<100)
        {
            move(2); 
            counter++;
        }
        else 
        {
            counter=0;
        }
    }

}
