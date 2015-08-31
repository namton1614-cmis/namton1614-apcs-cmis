public class FundamentalsP8
{
    public  static void main (String argvs [] )
    {
     String [] singers = new String[3]   ; 
     singers[0] = "Taylor Swift";
     singers[1] = "Serj Tankian";
     singers[2] = "Kanye West";  
     
     for ( int index = 0; index <singers.length; index++)
     {
       System.out.println( singers [index] );
        }
     System.out.println("\n");
     int x = (int)(Math.random()*(3));
     singers[x] = "Michael Jackson";
    for ( int index = 0; index <singers.length; index++)
     {
       System.out.println( singers [index] );
        }
     System.out.println("\n");
     for ( int index = 0; index <singers.length; index++)
     {

       if ( singers[index].equals("Michael Jackson"))
       {
               System.out.println( "We have found Michael Jackson." );
        }
        else
       {
            System.out.println( singers[index]+ " is not Michael Jackson.");
        }
    }
     System.out.println("\n");
    }//end main
}//end Fundamentals P8