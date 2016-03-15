import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private   int horizontal;
    private   int vertical;
    private int direction;

    public Robot()
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
    }    

    public void movement()
    {
        horizontal=0;
        vertical=0;

        if (Greenfoot.isKeyDown("left"))
        {
            setDirection(1);
            horizontal=-1;
            Actor wall = getOneObjectAtOffset(horizontal,vertical, Wall.class);
            Block block =(Block) getOneObjectAtOffset(horizontal,vertical, Block.class);

            if (block != null)
            { block.move(horizontal, vertical);
                   Actor block2 = getOneObjectAtOffset(horizontal,vertical, Block.class);
                if (block2==null)
                    move();}
            if (wall == null&&block==null)
                move();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setDirection(0);
            horizontal=1;
            Actor wall = getOneObjectAtOffset(horizontal,vertical, Wall.class);           
            Block block =(Block) getOneObjectAtOffset(horizontal,vertical, Block.class);
            if (block != null)
            { block.move(horizontal, vertical);
                Actor block2 = getOneObjectAtOffset(horizontal,vertical, Block.class);
                if (block2==null)
                    move();}
            if (wall == null&&block==null)
                move();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setDirection(3);
            vertical=1;
            Actor wall = getOneObjectAtOffset(horizontal,vertical, Wall.class);
            Block block =(Block) getOneObjectAtOffset(horizontal,vertical, Block.class);
            if (block != null)
            { block.move(horizontal, vertical);
                 Actor block2 = getOneObjectAtOffset(horizontal,vertical, Block.class);
                if (block2==null)
                    move();}
            if (wall == null&&block==null)
                move();
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setDirection(2);
            vertical=-1;
            Actor wall = getOneObjectAtOffset(horizontal,vertical, Wall.class);
            Block block =(Block) getOneObjectAtOffset(horizontal,vertical, Block.class);
            if (block != null)
            { block.move(horizontal, vertical);
                Actor block2 = getOneObjectAtOffset(horizontal,vertical, Block.class);
                if (block2==null)
                    move();}
            if (wall == null&&block==null)
                move();
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
