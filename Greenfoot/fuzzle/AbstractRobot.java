import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbstractRobot extends Actor
{
    private int direction;

    public AbstractRobot()
    {
        setDirection(2);
    }

    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        collect();
        bomb();
    }    
    
    public void bomb()
    {}

    public void collect()
    {
               Collectibles collect =(Collectibles) getOneObjectAtOffset(0,0, Collectibles.class);
        if (collect!=null)
        collect.collect();
    }

    public void movement()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setDirection(1);
            moveCheck(0,-1);
        } else
        if (Greenfoot.isKeyDown("right"))
        {
            setDirection(0);
            moveCheck(0,1);
        } else
        if (Greenfoot.isKeyDown("down"))
        {
            setDirection(3);
            moveCheck(1,0);
        } else
        if (Greenfoot.isKeyDown("up"))
        {
            setDirection(2);
            moveCheck(-1,0);
        }

    }

    /**
     * Move one cell forward in the current direction.
     */
    public void move()
    {
        switch(direction) {
            case 3 :
            setLocation(getX(), getY() + 1);
            break;
            case 0 :
            setLocation(getX() + 1, getY());
            break;
            case 2 :
            setLocation(getX(), getY() - 1);
            break;
            case 1 :
            setLocation(getX() - 1, getY());
            break;
        }
    }

    public void moveCheck(int vertical, int horizontal)
    {
        Actor Impass = getOneObjectAtOffset(horizontal,vertical, Impass.class);
        Block block =(Block) getOneObjectAtOffset(horizontal,vertical, Block.class);
        if (block != null)
        { block.move(horizontal, vertical);
            Actor block2 = getOneObjectAtOffset(horizontal,vertical, Block.class);
            if (block2==null)
                move();}
        else if (Impass == null)
            move();
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
