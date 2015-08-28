
public class FundamentalsP7
{
    public static void main (String argvs [] )
    {
      int[] intHold = new int[11];
      int x = 0;
      for ( int index = 0; index < intHold.length; index++ )
      {
        int a = (int) (Math.random()*100);
        int k = a % 2;

         if( k ==1 )
          {
           intHold[ index ] = (int)((Math.random()*100)*(-1) ); 
         }
         else 
         {
           x++;
           intHold[ index ] = (int)((Math.random()*100)*1  );     
         }              
        } //end for
        
      for ( int index = 0; index < intHold.length; index++ )
      {
        
          System.out.print( intHold[ index ] + " \n" );    
      
        } //end for
      System.out.println( "Number of positive integers = " + x + "\n" );    
      
    }//end main
}// end class FundamentalsP7