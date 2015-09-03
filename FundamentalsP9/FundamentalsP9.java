import java.util.Scanner;
public class FundamentalsP9
{
    public static void main (String argvs [])
    {
      Scanner input = new Scanner(System.in);
      int password = 0;
        while ( password !=314159)
        {
        System.out.println("\nInput Username.");

        String username = input.nextLine();

        if ( username.equals("SecondRight" ))
        {
            System.out.println("\nInput Password.");
             password = input.nextInt();
          if (password ==314159 )
          {
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
    }// end main
}// end class FundamentalsP9