import java.util.ArrayList;
import java.util.Scanner;
public class GameDriver     {
    public static void main (String argvs [] )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nSet row dimension");
        int row = input.nextInt();
        System.out.println("\nSet column dimension");
        int col = input.nextInt();

        Game MrZ = new Game (row, col);
        System.out.println(MrZ);
        MrZ.RandomZero();

        System.out.println("\nGuess the row!");
        int gRow = input.nextInt();
        System.out.println("\nGuess the column!");
        int gCol = input.nextInt();
        
        while (!MrZ.guess(gRow,gCol))
        {
            System.out.println("\nGuess the row!");
             gRow = input.nextInt();
            System.out.println("\nGuess the column!");
             gCol = input.nextInt();
        }
        
            System.out.println("Sucess!");
    }
} //end class  
