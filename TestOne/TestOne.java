import javax.swing.JOptionPane;  
public class TestOne
{
    public static void main (String argvs [] )
    {
        String ask = JOptionPane.showInputDialog( "Give me a number!" );
        int s = Integer.parseInt ( ask );
        double [] intHold = new double [s];        
        for ( int index = 0; index < intHold.length; index++ )
        {

            intHold[ index ] = (Math.random()*50); 

            System.out.print( index + ":" + intHold[ index ] + " \n"  );    

                   
        } //end for        
        int index = intHold.length-1;
        while ( index >= 0   )
        {

            int k =(int)intHold[ index ] % 2;

            if( k ==1 )

            {   System.out.print( index + ":");
                int counter = 0;

                while ( counter < intHold[ index ] )
                {
                    System.out.print( "O")    ;
                    counter++;
                }
                System.out.print( intHold[ index ] + " \n" );            
            }
            else 
            {
                System.out.print( index + ":");
                int counter = 0;

                while ( counter < intHold[ index ] )
                {
                    System.out.print( "E")    ;
                    counter++;
                }
                System.out.print( intHold[ index ] + " \n" );      
            }           

            index--;

        } //end for               

    }//end main
}// end class TestOne