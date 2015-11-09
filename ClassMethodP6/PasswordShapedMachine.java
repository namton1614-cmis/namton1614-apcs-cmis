import java.util.Scanner;
public class PasswordShapedMachine
{
    public static void main (String argvs [])
    {
        Scanner input = new Scanner(System.in);
        String password = "0";
        while ( password !="314159")
        {

            System.out.println("\nCreate a password!");
            password = input.nextLine();
            if (password.equals ("314159" ))
            {
                System.out.println( "Welcome, SecondRight." ); 
            }
            else 
            {
                System.out.println ("Password requirements not met.\nTry again. \n" );
            }

       
        }
    }// end main
}// end class FundamentalsP9