
public class SimpleCard
{
    private String suit;
    private String rank;
    
    public SimpleCard(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString()
    {
        return String.format("%s%s",rank, suit);
    }
}