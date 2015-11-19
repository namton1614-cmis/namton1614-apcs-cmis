
public class Ballista
{
    private int angle;
    private int power;

    /**
     * Constructor for objects of class Ballista
     */
    public Ballista()
    {
        angle =0;
        power=0;
    }

    public void setPower(int power)
    {
        this.power=power;
    }

    public void setAngle(int angle)
    {
        this.angle=angle;
    }

    public int getAngle()
    {
        return angle;
    }

    public int getPower()
    {
        return power;
    }

    public int getProjectileDistance()
    {
        int angValue=0;

        if (angle <=45)
        {
            angValue =angle;

        }
        if (angle >45)
        {
            angValue = 90-angle;

        }
        return angValue*power;
    }
}
