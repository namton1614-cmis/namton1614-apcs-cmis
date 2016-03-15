import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{

    public void move(int horizontal, int vertical)
    {
        Actor Block = getOneObjectAtOffset(horizontal, vertical, Block.class);
        Actor Wall = getOneObjectAtOffset(horizontal, vertical, Wall.class);
        if (Wall == null &&Block == null) 
            setLocation(getX()+horizontal, getY()+vertical);
  
    }
}
