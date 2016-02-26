import java.util.ArrayList;
/**
 * Write a description of class WorldApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldApp
{
    public static void main(String[] args)
    {
        String[] items = new String[] {"food", "garbage", "rocks", "screws", "mud", "wood", "metal", "beans", "people"};
        ArrayList<Consumer> consumers = new ArrayList<Consumer>();
        double option;
        while ( Math.random() > 0.05 )
        {
            option = Math.random();
            if ( option < 0.3 )
            {
                consumers.add(new Person());
            }
            else if ( option < 0.6 )
            {
                consumers.add(new Robot());
            }
            else
            {
                consumers.add(new Factory());
            }
        }
        
        String item;
        for( Consumer consumer : consumers )
        {
            item = items[(int)(Math.random() * items.length)];
            consumer.consume(item);
            while ( Math.random() > 0.1 )
            {
                item = items[(int)(Math.random() * items.length)];
                consumer.consume(item);
            }
        }
        
        for ( Consumer consumer : consumers)
        {    
            item = consumer.produce();
            System.out.println(consumer.getClass() + " produces: " + item);
        }
    }
}