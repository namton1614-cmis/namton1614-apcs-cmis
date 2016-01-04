public class Exia
{
    private int tAm;
    private boolean transAm;
    private String name;

    public Exia()
    {
        name="Exia";
        tAm=50;
        transAm=false;

    }

    public void TRANSAM()
    {
        if (tAm>80)
        {
            transAm=true;
        }
        if (transAm)
        {
            tAm+=10;
        }

    }

    public void powerDrive ()
    {
        int powerAdd =(int) ((Math.random()*10) - 4);
        tAm+=powerAdd;
    }

    public String activateTRANSAM ()
    {
        if (tAm>80)
        {return "TransAm activated!";}
        else
        { return "TransAm failed!";}
    }

    public String checkTransam ()
    {
        if (transAm)
        {return "on";}
        else
        { return "off";}
    }

    public String toString()
    {
        String output = String.format( 
                "Celestial Being \nSynchronization = %d\n"
                + "Trans Am = %b\n"
                + "Model = %s\n",

                tAm, transAm, name)
        ;
        return output; 
    }

}