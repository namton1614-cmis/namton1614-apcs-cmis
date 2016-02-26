import java.util.ArrayList;
public class Factory implements Consumer
{
    private ArrayList<String> resources;
    private ArrayList<String> products;
    
    public Factory()
    {
        resources = new ArrayList<String>();
    }
    
    public void consume(String item)
    {
        if ( item.equals("garbage") )
        {
            System.out.println(String.format("A factory cannot make anything from %s", item));
        }
        else
        {
            System.out.println(String.format("A factory will add %s to its resources", item));
            resources.add(item);
        }
    }
    
    public String produce()
    {
        String product = "";
        String item;
        int index;
        while ( resources.size() > 0 && Math.random() > 0.5)
        {
            index = (int)(Math.random() * resources.size());
            item = resources.get(index);
            product += item+"+";
            resources.remove(index);
            
        }
        return product;                   
    }    
}