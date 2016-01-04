public class Euler7

{

    public static void main (String arms [])
    {
        int prime=1;
        int primeCount=1;
        int primeCheck=0;
        System.out.println("2");
        while (primeCount<10001)
        {
            prime+=2;
            primeCheck=1;	
            for(int i = 3; i * i <= prime; i += 2)
            { 
                if (prime % i == 0) 
                {
                    primeCheck=0;
                }
            }
            if (primeCheck==1)
            {
                primeCount++;
                System.out.println(prime);
            }
        }

    }

}