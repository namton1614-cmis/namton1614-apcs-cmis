
/**
 * Write a description of class Thing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thing
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    public int z;
    /**
     * Constructor for objects of class Thing
     */
    public Thing()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * 2 argument constructor
     * @param x     the value for x
     * @param y     the value for y
     */
    public Thing(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets value of private instance  variable x
     * @return this.x
     */
    public int getX()
    {
        return this.x;
    }
    
    /**
     * Gets value of private instance  variable y
     * @return this.y
     */    public int getY()
    {
        
        return this.y;
    }
    
    /**
     * Gets twice the value of x
     * @return this.x * 2
     */
    public int getDoubleX()
    {
        return this.x * 2;
    }
    
    /**
     * Gets array of both instance variables
     * return { this.x, this.y }
     */
    public int[] getXandY()
    {
        int[] result = { this.x, this.y };
        return result;
    }
    
    public void setX(int newX)
    {
        this.x = newX;     
    }

    public void setY(int newY)
    {
        this.y = newY;     
    }
    
    public void doubleY()
    {
        this.y *= 2;
    }
    
    /**
     * Conditionally mutate the value of x or y
     * If modifier is even add it to x, if it's odd add it to y
     * @param modifier value to modify instance variable by
     */
    public void modify(int modifier)
    {
        if ( modifier % 2 == 0 )
        {
            this.x += modifier;
        } 
        else
        {
            this.y += modifier;
        }
    }
    
    /**
     * Get the sum of x and y
     * @return this.x + this.y
     */
    public int sum ()
    {
        return this.x + this.y;
    }
    
    /**
     * Compare 2 Things
     * If this is greater, return 1, if other return -1, else return 0
     * @param other the Thing to compare this to
     * @return int
     */
    public int compare( Thing other )
    {
        int sumThis = this.sum();
        int sumOther = other.sum();
        
        if ( sumThis > sumOther )
        {
            return 1;
        }
        else if ( sumThis < sumOther )
        { 
            return -1;
        }
        else
        {
            return 0;
        }
    }
}