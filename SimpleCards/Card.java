
public class Card
{
    private String suit;
    private String rank;

    public Card(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue()
    {
        if (rank.equals("King") ||rank.equals("Queen") ||  rank.equals("Jack"))
        { 
            return 10; 
        }

        else   if ( rank.equals("Ace"))
        {
            return 11;
        }
        else  
        {
            return Integer.parseInt(rank); 
        }
    }

    public String toString()
    {
        return String.format("%s%s",rank, suit);
    }
}