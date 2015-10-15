
public class CardsDriver {
    public static void main (String argvs [] )
    {
        Cards [] myHand = new Cards [3];
        String suit;
        String rank;       
        String [] suitMode = { "Clubs" , "Spades", "Hearts", "Diamonds"};
        String [] rankMode = { "2", "3", "4" , "5" , "6", "7", "8" ,"9" , "10", "Jack", "Queen" , "King", "Ace"};
        int suitNo;
        int rankNo;
        for ( int i = 0; i < myHand.length; i++ )
        {

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            myHand[ i ] = new Cards( suit, rank );
            System.out.println("Card " +(i+1)+"\n" +myHand[i] );
        } //end for
    }
} //end class CardDriver
