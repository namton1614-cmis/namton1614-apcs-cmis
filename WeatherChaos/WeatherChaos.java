import javax.swing.JOptionPane;  
public class WeatherChaos
{
    public static void main (String argvs [] )
    {
        String input = JOptionPane.showInputDialog( "Specify the number of days" );
        int length = Integer.parseInt ( input );
        int [] weatherTemps = new int [Math.abs(length)];    
        int swings = 0;
        String desc = "";
        String space1 ="    ";
        String space2 ="    ";
        String space3 ="    ";
        int max = 0;
        int min = 99;
        int day = 0;
        int sum = 0;
        int maxday=0;
        int minday=0;
        int maxSwing =0;
        int swingday=0;
        if (length>31 || length <1 )
        {
            System.out.println("That's not a valid number of days!");            
        } //make sure integer specified is 1-31
        else
        {
            System.out.println("day  temp  swing  description");
            for ( int index = 0; index < weatherTemps.length; index++ )
            {
                weatherTemps[ index ] = (int) (Math.random() * 200) - 100;
                day = index+1;//finds day
                int sumPart = weatherTemps [index];          
                sum += sumPart ;//finds sum
                
                if (index>0)
                {
                    swings =Math.abs (weatherTemps[ index ] -  weatherTemps[ index-1 ]);
                }// finds swing
                if (weatherTemps[ index ] <=40 )
                {
                    desc = "Hot";
                }
                if (weatherTemps[ index ] <=30)
                {
                    desc ="Comfortable";
                }
                if (weatherTemps[ index ] <=15 )
                {
                    desc ="Chilly";
                }
                if (weatherTemps[ index ] <=0)
                {
                    desc = "Freezing";
                }
                if (weatherTemps[ index ] >40)
                {
                    desc = "Boiling!";
                }
               /* if (day<10)
                { 
                space1 = "      ";
                }
                */ //spacing trials
                System.out.println (day+ space1 + weatherTemps[ index ]+ space2 +swings + space3 +desc);
                //end table generation 
                if (weatherTemps [index] >= max)
                {
                    max = weatherTemps [ index]; 
                    maxday= index+1;
                }
                if (weatherTemps [index] <= min)
                {
                    min = weatherTemps [ index];
                    minday = index+1;
                }
                if (swings >= maxSwing)
                {
                    maxSwing = swings;
                    swingday= index;
                }
            } //end for loop  
            System.out.println( "The minimum temperature was " + min +" on day " +minday +"."  );           
            System.out.println( "The maximum temperature was " + max +" on day " +maxday +"." );
            System.out.println( "The average temperature was " + (double)sum/weatherTemps.length  +".");
            System.out.println( "The biggest temperature swing was " + maxSwing+" degrees between day " 
                + (swingday) + " and day " + (swingday+1) + "." );
        }
    } // end main
}// end class WeatherChaos