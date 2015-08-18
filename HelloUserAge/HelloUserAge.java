import java.util.Scanner;

public class HelloUserAge
{
  public static void main ( String args[] ) 
  {
   Scanner sc=new Scanner(System.in);  
   System.out.println("What's your name?");  
   String name=sc.next();  
   System.out.println("How old are you?");  
   int age=sc.nextInt();  
   System.out.println("Hello, "+ name + "! You are " + age +" years old.");  
   sc.close();  

  } // end main
} // end class HelloUserAge