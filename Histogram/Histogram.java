import javax.swing.JOptionPane;  
public class Histogram
{
    public static void main (String argvs [] )
    {
        String input = JOptionPane.showInputDialog( "Give me a integer" );
        int length = Integer.parseInt ( input );
        int [] randomNumbers = new int [length];        
        int [] count = new int [100];

        for ( int index = 0; index < randomNumbers.length; index++ )
        {

            randomNumbers[ index ] = (int)(Math.random()*100); 

        } //end for  
        for ( int index = 0; index <length; index++ )
        {
            int counter= randomNumbers[ index ];
            count[counter]++;

        }
        for ( int index = 0; index <= 99; index++ )
        {
            System.out.print( index + ":"  );    
            for (int newindex = 0; newindex <= count[index]; newindex++)
            {
                System.out.print( "#" );    

            }
            System.out.println( ""  );    
        }
        // end histogram generation
    } // end main
    }
