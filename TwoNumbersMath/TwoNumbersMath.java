import javax.swing.JOptionPane;  

class TwoNumbersMath{  
  public static void main ( String args [] ) 
 {  
   int sum = 0;
   
   String first = JOptionPane.showInputDialog( "Give me a number!" );
   String second = JOptionPane.showInputDialog( "Give me another number!" );
   
   int one = Integer.parseInt ( first );
   int two = Integer.parseInt ( second );
   
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
}   // end class InputData