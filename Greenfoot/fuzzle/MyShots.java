import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyShots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MyShots extends Final
{
    int speed=20;
    public void act() 
    {
        attack();
        if(getWorld()!=null)
            movement();
    }    

    public void attack()
    {
        Boss boss;
        boss =(Boss) getOneObjectAtOffset(0,0,Boss.class);  
        if (boss!=null)
        {
           boss.damage();
        }
    }

    public void movement( )
    {

        if ( this.getY()==0)
        {
            World world = getWorld();
            world.removeObject(this);
        }
        else
            move(speed);

    }
}
