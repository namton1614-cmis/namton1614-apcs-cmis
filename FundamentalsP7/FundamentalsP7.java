
public class FundamentalsP7
{
    public static void main (String argvs [] )
    {
      int[] intHold = new int[11];
      int positiveCount = 0;
      for ( int index = 0; index < intHold.length; index++ )
      {
         if( Math.random() <= 0.5 )
          {
           intHold[ index ] = (int)((Math.random()*100)*(-1) ); 
         }
         else 
         {
           positiveCount++;
           intHold[ index ] = (int)((Math.random()*100)*1  );     
         }              
        } //end for
        
      for ( int index = 0; index < intHold.length; index++ )
      {
        
          System.out.print( intHold[ index ] + " \n" );    
      
        } //end for
      System.out.println( "Number of positive integers = " + positiveCount + "\n" );    
      
    }//end main
}// end class FundamentalsP7