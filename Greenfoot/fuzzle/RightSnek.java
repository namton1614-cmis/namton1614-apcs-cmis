import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightSnek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightSnek extends Snek
{
 
    public   RightSnek() 
    {
                        getImage().mirrorHorizontally();
direction=-1;
    }    
    
       public void attack()
    {
        World world = getWorld();
        RightSnekAttack SnekAttack = new RightSnekAttack();
        world.addObject(SnekAttack,this.getX()+direction,this.getY());
    }
}
