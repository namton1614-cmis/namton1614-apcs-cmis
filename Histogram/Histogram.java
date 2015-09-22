import javax.swing.JOptionPane;  
public class Histogram
{
    public static void main (String argvs [] )
    {
        String input = JOptionPane.showInputDialog( "Give me a integer" );
        int length = Integer.parseInt ( input );
        int [] randomNumbers = new int [length];        
        int [] count = new int [100];
        int sum = 0;
        int max = 0;
        int min = 99;
        int most = 0;
        int mostPart = 0;
        for ( int index = 0; index < randomNumbers.length; index++ )
        {

            randomNumbers[ index ] = (int)(Math.random()*100); 
            int counter= randomNumbers[ index ];
            count[counter]++;
        } //end for  
        for ( int index = 0; index <= 99; index++ )
        {
            System.out.print( index + ":"  );    
            for (int newindex = 0; newindex < count[index]; newindex++)
            {
                System.out.print( "#" );    
            }
            System.out.println( ""  );    
        }        
        // end histogram generation
        for ( int index = 0; index < length; index++ )
        {
            int sumPart = randomNumbers [index];          
            sum += sumPart ;
            if (randomNumbers [index] >= max)
            {
                max = randomNumbers [ index];
            }
            if (randomNumbers [index] <= min)
            {
                min = randomNumbers [ index];
            }
        }
        for ( int index = 0; index < count.length; index++ )
        {
            if (count [index] >= mostPart)
            {
                mostPart = count [index];
                most = index;
            }
        }

        System.out.println( "MIN:" + min  );           
        System.out.println( "MAX:" + max  );
        System.out.println( "SUM:" + sum  );   
        System.out.println( "AVG:" + (double)sum/length  );    
        System.out.println( "MST:" + most );    
    } // end main
}// end class
