
public class BlackjackDriver {
    public static void main (String argvs [] )
    {
        Cards [] dealer = new Cards [2];
        Cards [] player1 = new Cards [2];
        Cards [] player2 = new Cards [2];
        Cards [] player3 = new Cards [2];
        Cards [] player4 = new Cards [2];
        Cards [] player5 = new Cards [2];
        String suit;
        String rank;       
        String [] suitMode = { "Clubs" , "Spades", "Hearts", "Diamonds"};
        String [] rankMode = { "2", "3", "4" , "5" , "6", "7", "8" ,"9" , "10", "Jack", "Queen" , "King", "Ace"};
        for ( int i = 0; i < 2; i++ )
        {

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            dealer[ i ] = new Cards( suit, rank );

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player1[ i ] = new Cards( suit, rank );

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player2[ i ] = new Cards( suit, rank );

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player3[ i ] = new Cards( suit, rank );

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player4[ i ] = new Cards( suit, rank );

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player5[ i ] = new Cards( suit, rank );

            System.out.println("Dealer Card " +(i+1)+"\n" +dealer[i] );
        } //end for
 
    }
} //end class StudentDriver
