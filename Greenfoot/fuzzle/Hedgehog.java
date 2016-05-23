import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hedgehog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hedgehog extends Enemy implements Exploder
{
    private int explodeCounter=0;
    private int direction=1;
    /**
     * Act - do whatever the Hedgehog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        attack();
        if (explodeCounter>5)
            explode();
    }    

    public void attack()
    {
        killRobot();
    }

    public void movement()
    {

        if (Greenfoot.getRandomNumber(100) <10)
        {
            Actor object = getOneObjectAtOffset(direction, 0, Object.class);
            if (object!=null || this.isAtEdge()==true)
            {
                turn(180);
                direction*=-1;
                getImage().mirrorVertically();
                explodeCounter++;

                if (this.isAtEdge()==true)
                {
                    Actor object2 = getOneObjectAtOffset(direction, 0, Object.class);
                    if (object2==null)
                        move(1);
                }
            }
            else
            {
                move(1);
                explodeCounter=0;
            }
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
        Fire Fire = new Fire();
        world.addObject(Fire,this.getX(),this.getY());
        world.removeObject(this);
    }
}
