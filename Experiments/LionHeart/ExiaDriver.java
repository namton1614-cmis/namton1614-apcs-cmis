import java.util.Scanner;
public class ExiaDriver
{
    public static void main (String argx [])
    {
        String response="";
        Scanner input = new Scanner(System.in);
        Exia exia = new Exia() ;
        while (exia.checkTransam().equals("off")  )
        {
            System.out.println("\nWhat will you do?");
            response = input.nextLine();
            if ( response.equals("charge") || response.equals("")   )
            {
                exia.powerDrive();                  
                System.out.println("Charging");
            }
               if ( response.equals("TRANSAM") || response.equals("s")   )
            {
                  System.out.println(exia.activateTRANSAM());
                  exia.TRANSAM();
            }
            
            System.out.println(exia);
        }
    }

}