
public class Ballista
{
    private double angle;
    private double power;

    /**
     * Constructor for objects of class Ballista
     */
    public Ballista()
    {
        angle =0;
        power=0;
    }

    public void setPower(double power)
    {
        this.power=power;
    }

    public void setAngle(double angle)
    {
        this.angle=angle;
    }

    public double getAngle()
    {
        return angle;
    }

    public double getPower()
    {
        return power;
    }

    public double getProjectileDistance()
    {
        double angValue=0;

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
