import java.util.ArrayList;
public class Robot implements Consumer
{
    private ArrayList<String> consumed;
    public Robot()
    {
        consumed = new ArrayList<String>();
    }
    
    public void consume(String item)
    {
        consumed.add(item);
        System.out.println(String.format("A robot says: 10110101101011 %s 101101", item));
    }   
    
    public String produce()
    {
        String item = consumed.get(0);
        consumed.clear();
        return item;
    }
}