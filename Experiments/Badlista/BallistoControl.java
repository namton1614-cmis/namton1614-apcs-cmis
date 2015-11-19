import javax.swing.JOptionPane;
import java.util.Scanner;

public class BallistoControl
{

    private int x;
    public static void main (String lololol [])
    {

        Scanner input = new Scanner(System.in);
        Monster MonA = new Monster ();

        System.out.println("A monster has appeared at " + MonA.getLocation()+ " meters. " +
            "\n You must shoot it! ");
        Ballista M = new Ballista ();

        System.out.println("\nSet your angle");
        M.setAngle( Integer.parseInt(input.nextLine()));

        System.out.println("\nSet your power");
        M.setPower( Integer.parseInt(input.nextLine()));

    }
}
