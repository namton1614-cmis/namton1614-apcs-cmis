import java.util.Scanner;
public class PasswordShapedMachine
{
    public static void main (String argvs [])
    {
        Scanner input = new Scanner(System.in);
        String password = "";
        int freeCompare =0;
        while ( password.length()<6 || freeCompare !=1)
        {
            freeCompare =0;            
            System.out.println("\nCreate a password!");
            password = input.nextLine();
            String compareMan [] = new String [ password.length()];
            for (int i =0; i < password.length(); i++)
            {
                compareMan [i]=password.substring(i,i+1);
                if (compareMan [i].equals("*") 
                || compareMan [i].equals("+") 
                || compareMan [i].equals("-") 
                || compareMan [i].equals("/") 
                || compareMan [i].equals("@"))
                {
                    freeCompare = 1;
                }
            }
            if ( password.length()>=6 && freeCompare ==1)
            {
                System.out.println( "Password has been accepted." ); 
            }
            else 
            {
                System.out.println ("Password requirements not met.\nTry again. \n" );
            }
        }// end main
    }// end class PasswordMachinaFactoryP9
}
// !password.equals ("314159") 