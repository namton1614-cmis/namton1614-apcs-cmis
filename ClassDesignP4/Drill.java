
public class Drill
{
    private boolean electric;
    private String brand;
    private double price; 
    public String toString( )
    {
        return String.format( 
            "Brand: %s\n" +
            "Price:%.2f\n" + 
            "Electric: %s" ,
            brand,price,electric ? "Electric" : "Diesel");
    }

    public Drill()
    {
        price = 19.75 ;
        brand = new String ("Makitec");
        electric =true ;
    } //end constructor Song
    public Drill (String brand, int price, boolean electic)
    {
        this.price = price;
        this.brand = new String (brand);
        this.electric = electric;
    }

}
