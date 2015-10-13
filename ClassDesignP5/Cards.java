public class Cards
{
    private String suit;
    private String rank;

    public String toString( )
    {
        return String.format( 
            "Suit: %s\n" +
            "Rank:%.s\n" , 
            suit,rank);
    }

    public Cards()
    {
        suit = new String  ("hearts") ;
        rank = new String ("queen");

    } 
    public Cards (String suit, String value)
    {
        this.suit = new String (suit);
        this.rank = new String (rank);
    }

}