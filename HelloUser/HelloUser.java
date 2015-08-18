import java.util.Scanner;

public class HelloUser
{
  public static void main ( String args[] ) 
  {
    System.out.println( "What is your name?" );
      
      Scanner input = new Scanner ( System.in );
      String statement = input.nextLine();
    System.out.println( "Hello, " + statement + ".");

  } // end main
} // end class HelloUser