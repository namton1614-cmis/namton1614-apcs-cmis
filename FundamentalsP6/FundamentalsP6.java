
public class FundamentalsP6
{
    public static void main (String argvs [] )
    {
      int[] maxArray = new int[50];
    
      int max = maxArray.length;
      for ( int index = 0; index < max; index++ )
      {
        
          maxArray[ index ] = (int)(Math.random()*100   );     
        
        } //end for
      for ( int index = 0; index < max; index++ )
      {
        
          System.out.print( maxArray[ index ] + " " );    
      
        } //end for
      System.out.print( "\n" );    
      
    }//end main
}// end class FundamentalsP6