
public class HDTV extends TV implements Digital 
{

    public  HDTV (boolean tvOn)
    {
        super (tvOn);

    }

    public String connectHDMI()
    {

        return "HDMI cable connected";
    }

    public String tvType()
    {
        return "I'm a High Def 24 million color TV!";
    }

    public String toString()
    {
        return super.toString() ;


    }
}