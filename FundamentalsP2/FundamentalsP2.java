import javax.swing.JOptionPane;  
public class FundamentalsP2
{
  public static void main ( String args[] ) 
  {
   String x = JOptionPane.showInputDialog( "Give me a number!" );    
   String y = JOptionPane.showInputDialog( "Give me a number!" );      
   
    double a = Double.parseDouble ( x );
    double b = Double.parseDouble ( y );

   if( a < b)
        {
        System.out.println ( "The value of a is " +a + " and it is less than b whose value is "+ b+ "." );
        }
   if( a > b)
        {
        System.out.println ( "The value of a is " +a + " and it is more than b whose value is "+ b+ "." );
        }
   if( a == b)
        {
        System.out.println ( "The value of a is " +a + " and it is equal b whose value is "+ b+ "." );
        }     
  } // end main
} // end class FundamentalsP2