public class Euler6

{
    public static void main (String arms [])
    {
        int sumSquare =0;
        int squareSum =0;

        for (int i =1;i<=100;i++)
        {
            sumSquare+= i*i;
        }

        for (int i =1;i<=100;i++)
        {
            squareSum+=i;
        }

        System.out.println((squareSum*squareSum)-sumSquare);
    }

}

