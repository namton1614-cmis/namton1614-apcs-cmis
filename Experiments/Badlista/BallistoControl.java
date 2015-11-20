import javax.swing.JOptionPane;
import java.util.Scanner;

public class BallistoControl
{
    public Ballista M = new Ballista ();

    public static void main (String lololol [])
    {
        double monster =0;
        double projectile =0;
        double missDistance=0;
        Scanner input = new Scanner(System.in);
        Monster MonA = new Monster ();

        System.out.println("A monster has appeared at " + MonA.getLocation()+ " meters. " +
            "\nYou must shoot it! ");
        Ballista M = new Ballista ();
        monster= MonA.getLocation();

        System.out.println("\nSet your angle");
        M.setAngle( Double.parseDouble(input.nextLine()));
        System.out.println("\nSet your power");
        M.setPower( Double.parseDouble(input.nextLine()));
        projectile=M.getProjectileDistance();
        while (monster != projectile)
        {
            missDistance=Math.abs(monster-projectile);
            System.out.println("\nYou missed!" + 
            "\nThe monster is still at " + MonA.getLocation()+ " meters." +
            "\nYou were " + "%f.2"  + " meters off target." , missDistance); 

            System.out.println("\nSet your angle");
            M.setAngle( Integer.parseInt(input.nextLine()));

            System.out.println("\nSet your power");
            M.setPower( Integer.parseInt(input.nextLine()));
            projectile=M.getProjectileDistance();

        }
        System.out.println("\nYou have shot down the monster!\n" + MonA); 
    }
}
