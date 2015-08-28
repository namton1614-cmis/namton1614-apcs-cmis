public class FundamentalsP8
{
    public  static void main (String argvs [] )
    {
     String [] Singers = new String[3]   ; 
     int k = 0;
     int l = 1;
     int g = 2;
     Singers[k] = "A";
     Singers[l] = "B";
     Singers[g] = "C";  
     
     for ( int index = 0; index <Singers.length; index++)
     {
       System.out.println( Singers [index] );
        }
     int x = (int)(Math.random()*(3));
        Singers[x] = "Michael Jackson";
    for ( int index = 0; index <Singers.length; index++)
     {
       System.out.println( Singers [index] );
        }
     for ( int index = 0; index <Singers.length; index++)
     {

       if (k==x)
       {
               System.out.println( "We have found Michael Jackson." );
        }
        else
       {
            System.out.println( Singers[index]+ " is not Michael Jackson.");
        }
    }
    }//end main
}//end Fundamentals P8