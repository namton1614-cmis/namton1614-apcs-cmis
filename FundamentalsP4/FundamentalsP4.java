
public class FundamentalsP4
{
  public static void main ( String args[] ) 
  {
   for( int base = 1; base < 11;base++ )
        {
        System.out.println ( base + "\t" + base*base + "\t" + (int)(Math.random() * (base*base - base) + base));
        } // end for
  } // end main
} // end class FundamentalsP4