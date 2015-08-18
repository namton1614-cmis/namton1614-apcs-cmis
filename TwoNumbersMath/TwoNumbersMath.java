import javax.swing.JOptionPane;  

public class TwoNumbersMath{  
  public static void main ( String args [] ) 
 {  
   float sum = 0;
   
   String first = JOptionPane.showInputDialog( "Give me a number!" );
   String second = JOptionPane.showInputDialog( "Give me another number!" );
   
   float one = Float.parseFloat ( first );
   float two = Float.parseFloat ( second );
   
   sum = one + two ;
   System.out.println ( first +"+"+ second +"="+ sum );
   
   sum = one - two ;
   System.out.println ( first +"-"+ second +"="+ sum );
   
   sum = one * two ;
   System.out.println ( first +"*"+ second +"="+ sum );
   
   sum = one / two ;
   System.out.println ( first +"/"+ second +"="+ sum ); 
   
   sum = one % two ;
   System.out.println ( first +"%"+ second +"="+ sum );  
   
 }  // end main
}   // end class TwoNumbersMaths