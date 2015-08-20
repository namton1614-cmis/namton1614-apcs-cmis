import javax.swing.JOptionPane;  
public class FundamentalsP3
{
  public static void main ( String args[] ) 
  {
   String x = JOptionPane.showInputDialog( "Give me a number!" );    

   
    int a = Integer.parseInt ( x );
    int k = a % 2;

   if( k ==1 )
        {
        System.out.println ( a + " is an odd number." );
        }
   else 
        {
        System.out.println ( a + " is an even number." );
        }
     
  } // end main
} // end class FundamentalsP3
