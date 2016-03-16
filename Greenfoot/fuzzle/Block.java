import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Impass
{

    public void move(int horizontal, int vertical)
    {
        Actor Impass = getOneObjectAtOffset(horizontal, vertical, Impass.class);
        if (Impass == null) 
            setLocation(getX()+horizontal, getY()+vertical);
  
    }
}
