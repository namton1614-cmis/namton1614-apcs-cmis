import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends BombDestroyerAble
{

    public void move(int horizontal, int vertical)
    {
        Actor Object = getOneObjectAtOffset(horizontal, vertical, Object.class);
        Actor Water = getOneObjectAtOffset(horizontal, vertical, Water.class);
        if (Water !=null)
        {
            setLocation(getX()+horizontal, getY()+vertical);
            World world = getWorld();
            FilledWater FilledWater = new FilledWater();
            world.addObject(FilledWater,this.getX(),this.getY());
            world.removeObject(Water);
            world.removeObject(this);

          
        }
        else
        if (Object == null) 
            setLocation(getX()+horizontal, getY()+vertical);

    }
}
