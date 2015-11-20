
public class CardDriver {
    public static void main (String argvs [] )
    {
        String suit ="";
        String rank ="";   
        String [] suitMode = { "Clubs" , "Spades", "Hearts", "Diamonds"};
        String [] rankMode = { "2", "3", "4" , "5" , "6", "7", "8" ,"9" , "10", "Jack", "Queen" , "King", "Ace"};
        String [] stater = new String [52];
        SimpleCard  deck = new SimpleCard ( rank,  suit);
        SimpleCard[] deckP = new SimpleCard [52];
        int counter =0;

   

        for (int i=0; i < deckP.length; i++)
        {
            deckP[i] = new SimpleCard (suitMode [i%4],rankMode [i%13]);
        }
        for ( int i = 0; i < 5; i++ )
        {
            int random= (int)(Math.random()*52);
            System.out.println( deckP [random]);
        } //end for
    }
} //end class CardDriver
