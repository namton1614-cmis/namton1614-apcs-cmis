
import java.util.ArrayList;
public class Person implements Consumer
{
    private ArrayList<String> consumed;
    public Person()
    {
        consumed = new ArrayList<String>();
    }
    
    public void consume(String item)
    {
        if ( item.equals("food" ) )
        {
            consumed.add(item);
            System.out.println(String.format("A person says: I love %s. Thanks so much!", item));
        }
        else
        {
            System.out.println(String.format("A person says:I can't eat %s!", item));
        }
    }   
    
    public String produce()
    {
        return "waste";
    }
}