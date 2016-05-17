import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fighter extends Final
{
    private int speed;
    int counter=0;
    int counter2=0;
    private int magicpower;
    public Fighter()
    {
        setRotation(270);
        speed=10;
    }

    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        if (Greenfoot.isKeyDown("z"))
        {
            attack();
        }

    }

    public void attack()
    {
        counter++;
        TypeA typeA = new TypeA();
        TypeB typeB = new TypeB();
        TypeC typeC = new TypeC();
        TypeD typeD = new TypeD();
        TypeE typeE = new TypeE();
        if (counter==5)
        {
            World world = getWorld();
            world.addObject(typeA,this.getX(),this.getY());
            if (magicpower>60)
            {
                world.addObject(typeB,this.getX(),this.getY());
                world.addObject(typeC,this.getX(),this.getY());
            }
            if (magicpower>130&&counter2>4)
            {
                counter2=0;
                world.addObject(typeD,this.getX(),this.getY());
                world.addObject(typeE,this.getX(),this.getY());
                if (magicpower>200)
                {
                    counter2=4;
                }
            }
            else 
            {
                counter2++;
            }

            counter=0;
        }

    }

    public void move()
    { 
        int speed = this.speed;
        if (Greenfoot.isKeyDown("shift"))
        {
            speed=this.speed/2;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-speed,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+speed,getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-speed);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+speed);
        }
    }

    public void increasePower ( int power)
    {
        magicpower+=power;
    }

}
