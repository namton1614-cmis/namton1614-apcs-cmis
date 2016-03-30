import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explode extends Actor implements Exploder
{
    /**
     * Act - do whatever the Explode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.getRandomNumber(100) <2)
        {
            World world = getWorld();
            Fire Fire = new Fire();
            world.addObject(Fire,this.getX(),this.getY());
            explode();
            world.removeObject(this);
        }

    }   

    public void explode()
    {
        World world = getWorld();
        Actor right = getOneObjectAtOffset(1, 0, BombDestroyerAble.class);
        Actor left = getOneObjectAtOffset(-1, 0, BombDestroyerAble.class);
        Actor up = getOneObjectAtOffset(0, 1, BombDestroyerAble.class);
        Actor down = getOneObjectAtOffset(0, -1, BombDestroyerAble.class);
        if (right != null) 
            world.removeObject(right);
        if (left != null) 
            world.removeObject(left);
        if (up != null) 
            world.removeObject(up);
        if (down != null) 
            world.removeObject(down);

    }
}
