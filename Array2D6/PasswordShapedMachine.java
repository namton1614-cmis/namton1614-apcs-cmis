import java.util.Scanner;
import java.util.ArrayList;
public class PasswordShapedMachine
{
    public static void main (String argvs [])
    {
        Scanner input = new Scanner(System.in);
        String password = "";

        System.out.println("\nWhat is your last name?");
        String lastname = input.nextLine();
        String lastNameLC = lastname.toLowerCase();

        int freeCompare =0;
        ArrayList<String> lnArray = new ArrayList<String>(); 
        for (int i =0; i < lastNameLC.length(); i++)
        {
            String genox =lastNameLC.substring(i,i+1);
            lnArray.add(genox);
        }
        while ( password.length()<6 || freeCompare !=1)
        {
            freeCompare =0;            

            System.out.println("\nCreate a password!");
            password = input.nextLine();
            String passwordLC = password.toLowerCase();
            ArrayList<String> passArray = new ArrayList<String>(); 
            for (int i =0; i < passArray.size(); i++)
            {
                String lerin =password.substring(i,i+1);
                if (lerin.equals("*") 
                || lerin.equals("+") 
                ||lerin.equals("-") 
                ||lerin.equals("/") 
                || lerin.equals("@"))
                {
                    freeCompare = 1;
                }
            }
            int nameCheck=passwordLC.indexOf(lastNameLC);
            System.out.println(  password.length() +":"+freeCompare+":"+nameCheck); 
            if ( password.length()>=6 && freeCompare ==1 &&nameCheck<0)
            {
                System.out.println( "Password has been accepted." ); 
            }
            else if (nameCheck>=0)
            {
                System.out.println ("Password requirements not met.\nRemove your last name.\nTry again. \n" );
            }
            else 
            {
                System.out.println ("Password requirements not met.\nTry again. \n" );
            }
        }// end main
    }// end class PasswordMachinaFactoryP9
}
// !password.equals ("314159") 