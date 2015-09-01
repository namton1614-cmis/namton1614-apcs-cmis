import java.util.Scanner;
public class FundamentalsP9
{
    public static void main (String argvs [])
    {
        int x = 0;
        while ( x != 314159)
        {
        System.out.println("\nInput Username.");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        if ( username.equals("SecondRight" ))
        {
            System.out.println("\nInput Password.");
             Scanner inputpass = new Scanner(System.in);
             String password = inputpass.nextLine();
            int passNumber = Integer.parseInt ( password ); 
          if (password.equals("314159"))
          {

              while (x<314159)
              {
               x++ ;
            }
            System.out.println( "Welcome, SecondRight." ); 
           }
           else 
           {
              System.out.println ("Password Incorrect. Access Denied.  \n" );
            }
        }
        else 
        {
           System.out.println ("Username Incorrect. Access Denied.  \n" );
        }

      }
    }
}// end class FundamentalsP9