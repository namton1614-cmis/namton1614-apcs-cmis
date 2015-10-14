
import javax.swing.JOptionPane;
class Cubiverse
{
    // instance variables
    private String name;
    private int w=1;
    private int h=1;
    private int d=1;
    private double x=0.5;
    private double y=0.5;
    private double z=0.5;

    public String toString()
    {
        return String.format(
            "Name: %s\n" +
            "w: %d\n" + 
            "h: %d\n" +
            "d: %d\n" +
            "volume: %d\n" +
            "x: %.2f\n" +
            "y: %.2f\n" +
            "z: %.2f\n" +
            "distance from left: %.2f\n" +
            "distance from bottom: %.2f\n" +
            "distance from back: %.2f\n" ,
            name,w,h,d,w*h*d,x,y,z,w*x,h*y,d*z);
    }

    public Cubiverse( int w, int h , int d, String name )
    {

        this.w = w;
        this.h = h;
        this.d = d;
        this.name = new String (name);

    }
    public Cubiverse(double x, double y, double z,  String name )
    {

        this.name = new String (name);
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public Cubiverse()
    {
        name=  "Default Cubiverse-"+1* (Math.random());
        w=1;
        h=1;
        d=1;
        x=0.5;
        y=0.5;
        z=0.5;
    }
}
