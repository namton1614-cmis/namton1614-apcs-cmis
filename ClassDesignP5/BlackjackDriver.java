
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
        int [] dealerScore = new int [2];
        int [] player1Score = new int [2];
        int [] player2Score = new int [2];
        int [] player3Score = new int [2];
        int [] player4Score = new int [2];
        int [] player5Score = new int [2];
        String [] suitMode = { "Clubs" , "Spades", "Hearts", "Diamonds"};
        String [] rankMode = { "2", "3", "4" , "5" , "6", "7", "8" ,"9" , "10", "Jack", "Queen" , "King", "Ace"};
        for ( int i = 0; i < 2; i++ )
        {
            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            dealer[ i ] = new Cards( suit, rank );

            if ( rank.equals("2"))
            {
                dealerScore[i]=2;
            }
            else   if ( rank.equals("3"))
            {
                dealerScore[i]=3;
            }

            else   if ( rank.equals("4"))
            {
                dealerScore[i]=4;
            }
            else   if ( rank.equals("5"))
            {
                dealerScore[i]=5;
            }
            else   if ( rank.equals("6"))
            {
                dealerScore[i]=6;
            }
            else   if ( rank.equals("7"))
            {
                dealerScore[i]=7;
            }
            else   if ( rank.equals("8"))
            {
                dealerScore[i]=8;
            }
            else   if ( rank.equals("9"))
            {
                dealerScore[i]=9;
            }
            else   if ( rank.equals("Ace"))
            {
                dealerScore[i]=11;
            }
            else  
            {
                dealerScore[i]=10;
            }

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player1[ i ] = new Cards( suit, rank );
            if ( rank.equals("2"))
            {
                player1Score[i]=2;
            }
            else   if ( rank.equals("3"))
            {
                player1Score[i]=3;
            }

            else   if ( rank.equals("4"))
            {
                player1Score[i]=4;
            }
            else   if ( rank.equals("5"))
            {
                player1Score[i]=5;
            }
            else   if ( rank.equals("6"))
            {
                player1Score[i]=6;
            }
            else   if ( rank.equals("7"))
            {
                player1Score[i]=7;
            }
            else   if ( rank.equals("8"))
            {
                player1Score[i]=8;
            }
            else   if ( rank.equals("9"))
            {
                player1Score[i]=9;
            }
            else   if ( rank.equals("Ace"))
            {
                player1Score[i]=11;
            }
            else  
            {
                player1Score[i]=10;
            }

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player2[ i ] = new Cards( suit, rank );
            if ( rank.equals("2"))
            {
                player2Score[i]=2;
            }
            else   if ( rank.equals("3"))
            {
                player2Score[i]=3;
            }

            else   if ( rank.equals("4"))
            {
                player2Score[i]=4;
            }
            else   if ( rank.equals("5"))
            {
                player2Score[i]=5;
            }
            else   if ( rank.equals("6"))
            {
                player2Score[i]=6;
            }
            else   if ( rank.equals("7"))
            {
                player2Score[i]=7;
            }
            else   if ( rank.equals("8"))
            {
                player2Score[i]=8;
            }
            else   if ( rank.equals("9"))
            {
                player2Score[i]=9;
            }
            else   if ( rank.equals("Ace"))
            {
                player2Score[i]=11;
            }
            else  
            {
                player2Score[i]=10;
            }

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player3[ i ] = new Cards( suit, rank );
            if ( rank.equals("2"))
            {
                player3Score[i]=2;
            }
            else   if ( rank.equals("3"))
            {
                player3Score[i]=3;
            }

            else   if ( rank.equals("4"))
            {
                player3Score[i]=4;
            }
            else   if ( rank.equals("5"))
            {
                player3Score[i]=5;
            }
            else   if ( rank.equals("6"))
            {
                player3Score[i]=6;
            }
            else   if ( rank.equals("7"))
            {
                player3Score[i]=7;
            }
            else   if ( rank.equals("8"))
            {
                player3Score[i]=8;
            }
            else   if ( rank.equals("9"))
            {
                player3Score[i]=9;
            }
            else   if ( rank.equals("Ace"))
            {
                player3Score[i]=11;
            }
            else  
            {
                player3Score[i]=10;
            }

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player4[ i ] = new Cards( suit, rank );
            if ( rank.equals("2"))
            {
                player4Score[i]=2;
            }
            else   if ( rank.equals("3"))
            {
                player4Score[i]=3;
            }

            else   if ( rank.equals("4"))
            {
                player4Score[i]=4;
            }
            else   if ( rank.equals("5"))
            {
                player4Score[i]=5;
            }
            else   if ( rank.equals("6"))
            {
                player4Score[i]=6;
            }
            else   if ( rank.equals("7"))
            {
                player4Score[i]=7;
            }
            else   if ( rank.equals("8"))
            {
                player4Score[i]=8;
            }
            else   if ( rank.equals("9"))
            {
                player4Score[i]=9;
            }
            else   if ( rank.equals("Ace"))
            {
                player4Score[i]=11;
            }
            else  
            {
                player4Score[i]=10;
            }

            suit = suitMode [(int)(Math.random()*4)];
            rank = rankMode [(int)(Math.random()*13)];
            player5[ i ] = new Cards( suit, rank );
            if ( rank.equals("2"))
            {
                player5Score[i]=2;
            }
            else   if ( rank.equals("3"))
            {
                player5Score[i]=3;
            }

            else   if ( rank.equals("4"))
            {
                player5Score[i]=4;
            }
            else   if ( rank.equals("5"))
            {
                player5Score[i]=5;
            }
            else   if ( rank.equals("6"))
            {
                player5Score[i]=6;
            }
            else   if ( rank.equals("7"))
            {
                player5Score[i]=7;
            }
            else   if ( rank.equals("8"))
            {
                player5Score[i]=8;
            }
            else   if ( rank.equals("9"))
            {
                player5Score[i]=9;
            }
            else   if ( rank.equals("Ace"))
            {
                player5Score[i]=11;
            }
            else  
            {
                player5Score[i]=10;
            }

            System.out.println("Dealer Card " +(i+1)+"\n" +dealer[i] 
                +"\nPlayer 1 Card " +(i+1)+"\n" +player1[i]
                +"\nPlayer 2 Card " +(i+1)+"\n" +player2[i]
                +"\nPlayer 3 Card " +(i+1)+"\n" +player3[i]
                +"\nPlayer 4 Card " +(i+1)+"\n" +player4[i]
                +"\nPlayer 5 Card " +(i+1)+"\n" +player5[i]);

        } //end for
        
        int dealerSum =dealerScore[0]+dealerScore[1];
        int player1Sum =player1Score[0]+player1Score[1];
        int player2Sum =player2Score[0]+player2Score[1];
        int player3Sum =player3Score[0]+player3Score[1];
        int player4Sum =player4Score[0]+player4Score[1];
        int player5Sum =player5Score[0]+player5Score[1];
        if (player1Sum == 21 )
            System.out.println(" Player 1 blackjack! Player 1 has won. ");
        if (dealerSum >= player1Sum)
        {
            System.out.println(" Player 1 has lost this round. ");
        }
        if (dealerSum < player1Sum)
        {
            System.out.println(" Player 1 has won this round. ");
        }

        if (player2Sum == 21 )
            System.out.println(" Player 2 blackjack! Player 2 has won. ");
        if (dealerSum >= player2Sum)
        {
            System.out.println(" Player 2 has lost this round. ");
        }
        if (dealerSum < player2Sum)
        {
            System.out.println(" Player 2 has won this round. ");
        }
        
        if (player3Sum == 21 )
            System.out.println(" Player 3 blackjack! Player 3 has won. ");
        if (dealerSum >= player3Sum)
        {
            System.out.println(" Player 3 has lost this round. ");
        }
        if (dealerSum < player3Sum)
        {
            System.out.println(" Player 3 has won this round. ");
        }
        
        if (player4Sum == 21 )
            System.out.println(" Player 4 blackjack! Player 4 has won. ");
        if (dealerSum >= player4Sum)
        {
            System.out.println(" Player 4 has lost this round. ");
        }
        if (dealerSum < player4Sum)
        {
            System.out.println(" Player 4 has won this round. ");
        }
        
        if (player5Sum == 21 )
            System.out.println(" Player 5 blackjack! Player 5 has won. ");
        if (dealerSum >= player5Sum)
        {
            System.out.println(" Player 5 has lost this round. ");
        }
        if (dealerSum < player5Sum)
        {
            System.out.println(" Player 5 has won this round. ");
        }


    }
} //end class StudentDriver
