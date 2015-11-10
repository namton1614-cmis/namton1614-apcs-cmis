
public class CardDriver {
    public static void main (String argvs [] )
    {
        String suit ="";
        String rank ="";   
        String [] suitMode = { "Clubs" , "Spades", "Hearts", "Diamonds"};
        String [] rankMode = { "2", "3", "4" , "5" , "6", "7", "8" ,"9" , "10", "Jack", "Queen" , "King", "Ace"};
        String [] stater = new String [52];
        SimpleCard  deck = new SimpleCard ( rank,  suit);
        int counter =0;

        for ( int i = 0; i < suitMode.length; i++ )
        {
            suit = suitMode [i];
            for (int  u = 0; u < rankMode.length; u++ )
            {
                rank = rankMode [u];
                deck = new SimpleCard (  rank,  suit);
                stater [counter] = ""+deck;
                counter +=1;
            } //end for
        } //end for

        for ( int i = 0; i < 5; i++ )
        {
            int random= (int)(Math.random()*52);
            System.out.println( stater [random]);
        } //end for
    }
} //end class CardDriver
