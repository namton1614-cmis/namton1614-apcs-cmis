import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftSnek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftSnek extends Snek
{
 
    public   LeftSnek() 
    {
direction=1;
    }    
    
       public void attack()
    {
        World world = getWorld();
        LeftSnekAttack SnekAttack = new LeftSnekAttack();
        world.addObject(SnekAttack,this.getX()+direction,this.getY());
    }
}
