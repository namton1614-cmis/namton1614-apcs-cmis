
public class BWTV extends TV implements Analog 
{

    public  BWTV (boolean tvOn)
    {
        super (tvOn);

    }

    public String rotateRabbitEars()
    {

        return "Rabbit ears rotated 45 degrees";
    }

    public String tvType()
    {
        return "I'm a black and white TV!";
    }

    public String toString()
    {
        return super.toString() ;

    }
}